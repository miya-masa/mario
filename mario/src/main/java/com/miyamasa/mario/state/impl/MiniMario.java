package com.miyamasa.mario.state.impl;

import com.miyamasa.mario.state.MarioState;

public class MiniMario extends AliveMario implements MarioState {

	public MarioState hitEnemy() {
		return new DeadMario();
	}

}
