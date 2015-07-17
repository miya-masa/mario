package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.life.Life;
import com.miyamasa.mario.state.MarioState;

public class SuperMario extends AliveMario implements MarioState {

	public SuperMario(Life rest) {
		super(rest);
	}

	public MarioState hitEnemy() {
		return new MiniMario(getRest());
	}

}
