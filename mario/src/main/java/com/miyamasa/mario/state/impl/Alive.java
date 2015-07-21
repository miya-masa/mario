package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.state.MarioState;

public abstract class Alive implements MarioState {

	public MarioState getFlower() {
		return new Fire();
	}

	public MarioState getMushroom() {
		return new Super();
	}

	public MarioState getStar() {
		return new Star(this);
	}

	public MarioState fallHole() {
		return new Dead();
	}

	public MarioState getOneUpMashroom() {
		return this;
	}

}