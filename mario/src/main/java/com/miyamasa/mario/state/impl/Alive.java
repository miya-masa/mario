package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.exception.DeadException;
import com.miyamasa.mario.state.MarioState;

public abstract class Alive implements MarioState {

	public MarioState eatFlower() {
		return new Fire();
	}

	public MarioState eatMushroom() {
		return new Super();
	}

	public MarioState eatStar() {
		return new Star(this);
	}

	public MarioState fallHole() {
		throw new DeadException();
	}

	public MarioState eatOneUpMashroom() {
		return this;
	}

}
