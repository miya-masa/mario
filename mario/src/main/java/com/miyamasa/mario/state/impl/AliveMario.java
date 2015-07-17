package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.exception.GameOverException;
import com.miyamasa.mario.life.Life;
import com.miyamasa.mario.state.MarioState;

public abstract class AliveMario implements MarioState {

	public MarioState getFlower() {
		return new FireMario();
	}

	public MarioState getMushroom() {
		return new SuperMario();
	}

	public MarioState getStar() {
		return new StarMario(this);
	}

	public MarioState currentMario() {
		return this;
	}

	public MarioState fallHole() {
		return new DeadMario();
	}

	public MarioState getOneUpMashroom() {
		return this;
	}

}
