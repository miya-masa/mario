package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.life.Life;
import com.miyamasa.mario.state.MarioState;

public class FireMario extends AliveMario implements MarioState {

	public FireMario(Life rest) {
		super(rest);
	}

	public MarioState hitEnemy() {
		return new SuperMario(getRest());
	}

}
