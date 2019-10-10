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

/**
 * Cell is the basic unit of frog's brain
 * 
 * Cell这个类只保存很少的信息，而不是直接定义成对象，这样可方便它的参数变异。它的触突分布参数、对信号(即光子)的处理行为由CellTemplate
 * 中的type来完成。 Cell的排布由器官来完成，一个器官通常会撒布一群相同类型的细胞。
 * 
 * @author Yong Zhu
 * @since 2.0.2
 */
public class Cell {
	public int type; // 这个细胞的类型，见CellTemplate类中的type

	// energy of cell, energy got from food
	public float energy; // 每个细胞当前的能量值

	public float tire; // 每个细胞的疲劳值，只取决于最近的激活频率

}
