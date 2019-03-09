/*
 * Copyright 2018 the original author or authors. 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.github.drinkjava2.frog;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import com.github.drinkjava2.frog.brain.Cell;
import com.github.drinkjava2.frog.brain.Input;
import com.github.drinkjava2.frog.brain.Output;
import com.github.drinkjava2.frog.egg.CellGroup;
import com.github.drinkjava2.frog.egg.Egg;
import com.github.drinkjava2.frog.egg.Zone;
import com.github.drinkjava2.frog.env.Application;
import com.github.drinkjava2.frog.env.Env;
import com.github.drinkjava2.frog.env.Food;

/**
 * Frog = brain + body(mouth, eye, leg)
 * 
 * @author Yong Zhu
 * @since 1.0.0
 */
public class Frog {

	/** brain radius virtual unit */
	public float brainRadius;

	/** brain cells */
	List<Cell> cells = new ArrayList<Cell>();

	/** 视觉细胞的输入区在脑中的坐标，先随便取 在原点附件就可以了，以后再考虑放到蛋里去进化 */
	public static Zone eye = new Zone(0, 0, 300);

	/** 运动细胞的输入区在脑中的坐标，先随便取就可以了，以后再考虑放到蛋里去进化 */
	public static Zone moveUp = new Zone(500, 100, 10);
	public static Zone moveDown = new Zone(500, 200, 10);
	public static Zone moveLeft = new Zone(500, 300, 10);
	public static Zone moveRight = new Zone(500, 400, 10);

	public int x;
	public int y;
	public long energy = 10000;
	public Egg egg;

	static final Random r = new Random();
	static Image frogImg;
	static {
		try {
			frogImg = ImageIO.read(new FileInputStream(Application.CLASSPATH + "frog.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Frog(int x, int y, Egg egg) {
		this.x = x;
		this.y = y;
		if (egg.cellgroups == null)
			throw new IllegalArgumentException("Illegal egg cellgroups argument:" + egg.cellgroups);
		this.brainRadius = egg.brainRadius;
		for (int k = 0; k < egg.cellgroups.length; k++) {
			CellGroup g = egg.cellgroups[k];
			for (int i = 0; i < g.cellQty; i++) {// 开始根据蛋来创建脑细胞
				Cell c = new Cell();
				c.inputs = new Input[g.inputQtyPerCell];
				for (int j = 0; j < g.inputQtyPerCell; j++) {
					c.inputs[j] = new Input();
					Zone.copyXY(randomPosInZone(g.groupInputZone), c.inputs[j]);
					c.inputs[j].radius = g.cellInputRadius;
				}
				c.outputs = new Output[g.outputQtyPerCell];
				for (int j = 0; j < g.outputQtyPerCell; j++) {
					c.outputs[j] = new Output();
					Zone.copyXY(randomPosInZone(g.groupInputZone), c.outputs[j]);
					c.outputs[j].radius = g.cellOutputRadius;
				}
				cells.add(c);
			}
		}
		this.egg = egg;// 保留一份蛋，如果没被淘汰掉，将来下蛋时要用这个蛋来下新蛋
	}

	public void active(Env env) {
//		this.x = this.x - 1 + r.nextInt(3);
//		this.y = this.y - 1 + r.nextInt(3);
		// eat food
		boolean eatedFood = false;
		int j = env.foods.size() - 1;
		for (int i = j; i >= 0; i--) {
			Food food = env.foods.get(i);
			if (x == food.x && y == food.y) {
				energy = energy + food.energy;
				env.foods.remove(i);
				eatedFood = true;
				break;
			}
		}

		// 奖励
		if (eatedFood) {

		}

		// move
		for (Cell cell : cells) {
			for (Output output : cell.outputs) {
				if (Zone.nearby(moveUp, output)) {
					y += 1;
					break;
				} else if (Zone.nearby(moveDown, output)) {
					y -= 1;
					break;
				} else if (Zone.nearby(moveLeft, output)) {
					x -= 1;
					break;
				} else if (Zone.nearby(moveRight, output)) {
					x += 1;
					break;
				}
			}
		}
	}

	private boolean allowVariation = false;

	private float percet1(float f) {
		if (!allowVariation)
			return f;
		return (float) (f * (0.99f + r.nextFloat() * 0.02));
	}

	private float percet5(float f) {
		if (!allowVariation)
			return f;
		return (float) (f * (0.95f + r.nextFloat() * 0.10));
	}

	private static Zone randomPosInZone(Zone z) {
		return new Zone(z.x - z.radius + z.radius * 2 * r.nextFloat(), z.y - z.radius + z.radius * 2 * r.nextFloat(),
				0);
	}

	public Egg layEgg() {
		if (r.nextInt(100) > 25) // 变异率先固定在25%
			allowVariation = false;// 如果不允许变异，下的蛋就相当于克隆原来的蛋
		else
			allowVariation = true;
		Egg newEgg = new Egg();
		newEgg.brainRadius = percet5(egg.brainRadius);
		CellGroup[] cellgroups = new CellGroup[egg.cellgroups.length];
		newEgg.cellgroups = cellgroups;
		for (int i = 0; i < cellgroups.length; i++) {
			CellGroup cellGroup = new CellGroup();
			cellgroups[i] = cellGroup;
			CellGroup oldGp = egg.cellgroups[i];
			cellGroup.groupInputZone = new Zone(percet5(oldGp.groupInputZone.x), percet5(oldGp.groupInputZone.y),
					percet5(oldGp.groupInputZone.radius));
			cellGroup.groupOutputZone = new Zone(percet5(oldGp.groupOutputZone.x), percet5(oldGp.groupOutputZone.y),
					percet5(oldGp.groupOutputZone.radius));
			cellGroup.cellQty = Math.round(percet5(oldGp.cellQty));
			cellGroup.cellInputRadius = percet1(oldGp.cellInputRadius);
			cellGroup.cellOutputRadius = percet1(oldGp.cellOutputRadius);
			cellGroup.inputQtyPerCell = Math.round(percet5(oldGp.inputQtyPerCell));
			cellGroup.outputQtyPerCell = Math.round(percet5(oldGp.outputQtyPerCell));
		}
		return newEgg;
	}

	public void show(Graphics g) {
		g.drawImage(frogImg, x - 8, y - 8, 16, 16, null);
	}

}
