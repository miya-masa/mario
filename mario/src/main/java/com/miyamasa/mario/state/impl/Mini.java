package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.exception.DeadException;
import com.miyamasa.mario.state.MarioState;

public class Mini extends Alive implements MarioState {

	public MarioState hitEnemy() {
		throw new DeadException();
	}

}
