package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.state.MarioState;

public class Fire extends Alive implements MarioState {

	public MarioState hitEnemy() {
		return new Super();
	}

}
