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

import java.util.List;

/**
 * Cell represents a nerve cell, this is the basic unit of brain
 * 
 * @author Yong Zhu
 * @since 1.0.0
 */
public class Cell {
	/** x location in brain */
	public int x = 0;

	/** y location in brain */
	public int y = 0;

	/** z location in brain */
	public int z = 0;

	public int active = 0;

	// cell type, 0:normal 1:xxx 2:xxx 3:xxx ...
	public int type = 0;

	/** Connected other cells */
	List<Cell> connects;
}
