package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.exception.DeadException;
import com.miyamasa.mario.state.MarioState;

public class Dead implements MarioState {

	public MarioState getFlower() {
		throw new DeadException();
	}

	public MarioState getMushroom() {
		throw new DeadException();
	}

	public MarioState getStar() {
		throw new DeadException();
	}

	public MarioState hitEnemy() {
		throw new DeadException();
	}

	public MarioState fallHole() {
		throw new DeadException();
	}

	public MarioState getOneUpMashroom() {
		throw new DeadException();
	}

}
