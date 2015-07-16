package com.miyamasa.mario.impl;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.life.Life;

public class FireMario extends AliveMario implements Mario {

	public FireMario(Life rest) {
		super(rest);
	}

	public Mario hitEnemy() {
		return new SuperMario(getRest());
	}

}
