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
package com.github.drinkjava2.frog.brain.organ;

import com.github.drinkjava2.frog.Frog;
import com.github.drinkjava2.frog.brain.Cell;
import com.github.drinkjava2.frog.brain.Input;
import com.github.drinkjava2.frog.brain.Organ;

/**
 * Move down frog 1 unit if outputs of nerve cells active in this zone
 */
public class Hungry extends Organ {
	private static final long serialVersionUID = 1L;

	@Override
	public void active(Frog f) {
		for (Cell cell : f.cells) {  
			if (f.frogEngery < 10000 && cell.energy < 1000)
				for (Input input : cell.inputs)
					if (input.nearby(this)) // input zone near by hungry zone
						cell.energy += 2;
		}
	}

}