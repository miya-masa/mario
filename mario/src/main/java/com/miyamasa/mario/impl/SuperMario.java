package com.miyamasa.mario.impl;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.life.Life;

public class SuperMario extends AliveMario implements Mario {

	public SuperMario(Life rest) {
		super(rest);
	}

	public Mario hitEnemy() {
		return new MiniMario(getRest());
	}

}
