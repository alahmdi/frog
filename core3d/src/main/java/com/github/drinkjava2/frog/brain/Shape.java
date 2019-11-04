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

import java.io.Serializable;

import com.github.drinkjava2.frog.Frog;

/**
 * Shape represents a 3d zone in brain
 * 
 * Shape用来表示脑内器官的形状,一个器官只能有一个shape
 * 
 * @author Yong Zhu
 * @since 2.0.2
 */
public interface Shape extends Serializable {
	/* Draw self on brain picture */
	public void drawOnBrainPicture(BrainPicture pic); // 把自己在脑图上画出来

	public void fillCellsWithAction(Frog f, Organ o); // 根据给定organ的参数，在shape所代表的脑区内添加脑细胞并加入对应细胞的行为

	public void createCells(Frog f, Organ o); // 在organ所代表的脑区内仅创建空的Cell对象
}
