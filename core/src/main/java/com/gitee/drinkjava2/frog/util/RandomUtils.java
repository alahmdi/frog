/* Copyright 2018-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.gitee.drinkjava2.frog.util;

import java.util.Random;

import com.gitee.drinkjava2.frog.Animal;
import com.gitee.drinkjava2.frog.brain.Organ;
import com.gitee.drinkjava2.frog.brain.Zone;
import com.gitee.drinkjava2.frog.organ.Line;
import com.gitee.drinkjava2.frog.organ.frog.FrogBigEye;

/**
 * Random Utilities used in this project
 * 
 * @author Yong Zhu
 * @since 1.0
 */
public class RandomUtils {

	private RandomUtils() {
	}

	private static final Random rand = new Random();

	public static int nextInt(int i) {
		return rand.nextInt(i);
	}

	public static float nextFloat() {
		return rand.nextFloat();
	}

	public static boolean percent(float percent) {// 有百分这percent的机率为true
		return rand.nextFloat() * 100 < percent;
	}

	public static Zone randomZoneInZone(Zone o) { // 在一个区内随机取一个小小区
		return new Zone(o.x - o.r + o.r * 2 * rand.nextFloat(), o.y - o.r + o.r * 2 * rand.nextFloat(),
				o.z /*- o.r + o.r * 2 * rand.nextFloat()*/, o.r * rand.nextFloat() * .3f, o.h * rand.nextFloat() * .3f);
	}

	/** Return a random zone inside of frog's random organ */
	public static Zone randomZoneInOrgans(Animal a) {
		if (a.organs == null || a.organs.isEmpty())
			throw new IllegalArgumentException("Can not call randomPosInRandomOrgan method when has no organ");
		Organ o = null;
		if (percent(10)) {// 增加选中大眼睛的机率，因为里面感光细胞多
			for (Organ og : a.organs) {
				if (og instanceof FrogBigEye) {
					o = og;
					break;
				}
			}
		}
		if (o == null)
			o = a.organs.get(1 + RandomUtils.nextInt(a.organs.size() - 1)); // 跳过第一个器官
		if (o instanceof Line) {
			return randomZoneInZone(((Line) o).bodyZone);
		} else {
			return randomZoneInZone(o);
		}
	}

	public static int vary(int v, int percet) {
		if (percent(percet))
			return vary(v);
		return v;
	}

	public static int vary(int v) {// 随机有大概率小变异，小概率大变异，极小概率极大变异
		if (percent(40))
			v += v * .04 * (nextFloat() - 0.5); // v=v+-.04
		if (percent(10))
			v += v * .103 * (nextFloat() - 0.5); // v=v+-0.1
		else if (percent(5))
			v += v * 1 * (nextFloat() - 0.5); // v=v+-0.4
		else if (percent(2))
			v += v * 4 * (nextFloat() - 0.5); // v=v+-2
		else if (percent(1f))
			v += v * 8 * (nextFloat() - 0.5); // v=v+-6
		return v;
	}

	public static float vary(float v) {// 随机有大概率小变异，小概率大变异，极小概率极大变异
		if (percent(40))
			v += v * .04 * (nextFloat() - 0.5); // v=v+-.04
		if (percent(10))
			v += v * .103 * (nextFloat() - 0.5); // v=v+-0.1
		else if (percent(5))
			v += v * 1 * (nextFloat() - 0.5); // v=v+-0.4
		else if (percent(2))
			v += v * 4 * (nextFloat() - 0.5); // v=v+-2
		else if (percent(1f))
			v += v * 8 * (nextFloat() - 0.5); // v=v+-6
		return v;
	}

	public static int varyInLimit(int v, int from, int to) {// 让返回值在from和to之间随机变异
		int i = vary(v);
		if (i < from)
			i = from;
		if (i > to)
			i = to;
		return i;
	}

	public static float varyInLimit(float v, float from, float to) {// 让返回值在from和to之间随机变异
		float i = vary(v);
		if (i < from)
			i = from;
		if (i > to)
			i = to;
		return i;
	}

}
