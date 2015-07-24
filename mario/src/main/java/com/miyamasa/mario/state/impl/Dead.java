package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.exception.DeadException;
import com.miyamasa.mario.state.MarioState;

public class Dead implements MarioState {

	public MarioState eatFlower() {
		throw new DeadException();
	}

	public MarioState eatMushroom() {
		throw new DeadException();
	}

	public MarioState eatStar() {
		throw new DeadException();
	}

	public MarioState hitEnemy() {
		throw new DeadException();
	}

	public MarioState fallHole() {
		throw new DeadException();
	}

	public MarioState eatOneUpMashroom() {
		throw new DeadException();
	}

}
