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
package com.github.drinkjava2.frog.brain;

import java.awt.Color;
import java.awt.Graphics;

import com.github.drinkjava2.frog.Frog;
import com.github.drinkjava2.frog.util.RandomUtils;

/**
 * Organ is a part of frog, organ can be saved in egg
 * 
 * 器官是脑的一部分，多个器官在脑内可以允许重叠出现在同一位置。
 * 
 * @author Yong Zhu
 * @since 1.0.4
 */
public class Organ extends Zone {
	private static final long serialVersionUID = 1L;
	public String name; // 显示在脑图上的器官名称，可选
	public long fat = 0; // 如果活跃多，fat值高，则保留（及变异）的可能性大，反之则很可能丢弃掉
	public float organActiveEnergy = 1; // 执行器官激活需要消耗细胞多少能量
	public float organOutputEnergy = 2; // 感觉 器官激活会给细胞增加多少能量
	public boolean initilized; // 通过这个标记判断是否需要手工给定它的参数初值

	public boolean allowBorrow() { // 是否允许在精子中将这个器官借出
		return false;
	}

	/** Each loop step call active method, Child class can override this method */
	public void active(Frog f) { // 每一步都会调用器官的active方法 ，缺省啥也不干
	}

	/** If active in this organ's zone? */
	public boolean outputActive(Frog f) { // 如果一个细胞能量>10,且它的输出触突位于这个器官内，则器官被激活
		for (Cell cell : f.cells) {
			if (cell.energy > organActiveEnergy)
				for (Output output : cell.outputs) { //
					if (this.nearby(output)) {
						cell.organ.fat++;
						cell.energy -= organActiveEnergy;
						return true;
					}
				}
		}
		return false;
	}

	/** Set X, Y, Radius, name of current Organ */
	public Organ setXYRN(float x, float y, float r, String name) {
		this.setXYR(x, y, r);
		this.name = name;
		return this;
	}

	/** Child class can override this method to drawing picture */
	public void drawOnBrainPicture(BrainPicture pic) {// 把自已这个器官在脑图上显示出来，子类可以重写这个方法
		Graphics g = pic.getGraphics();// border
		g.setColor(Color.BLACK); // 缺省是黑色
		pic.drawZone(g, this);
		if (this.name != null)
			pic.drawText(g, this, String.valueOf(this.name));
	}

	/** Only call once when frog created , Child class can override this method */
	public void initFrog(Frog f) { // 仅在Frog生成时这个方法会调用一次，缺省啥也不干，通常用于Group子类的初始化
	}

	public void varyParam() {
		organActiveEnergy = RandomUtils.vary(organActiveEnergy);
		organOutputEnergy = RandomUtils.vary(organOutputEnergy);
	}

	/** Only call once after organ be created by new() method */
	public Organ[] vary() { // 在下蛋时每个器官会调用这个方法，缺省返回一个类似自已的副本，子类通常要覆盖这个方法
		Organ newOrgan = null;
		try {
			newOrgan = this.getClass().newInstance();
		} catch (Exception e) {
			throw new UnknownError("Can not make new Organ copy for " + this);
		}
		copyXYR(this, newOrgan);
		newOrgan.name = this.name;
		newOrgan.fat = this.fat;
		return new Organ[] { newOrgan };
	}

}
