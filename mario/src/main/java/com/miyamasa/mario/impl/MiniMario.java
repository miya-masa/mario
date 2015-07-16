package com.miyamasa.mario.impl;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.life.Life;

public class MiniMario extends AliveMario implements Mario {

	public MiniMario(Life rest) {
		super(rest);
	}

	public Mario hitEnemy() {
		return new DeadMario(getRest());
	}

}
