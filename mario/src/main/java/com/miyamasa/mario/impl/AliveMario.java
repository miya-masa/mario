package com.miyamasa.mario.impl;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.exception.GameOverException;
import com.miyamasa.mario.life.Life;

public abstract class AliveMario implements Mario {

	private final Life rest;

	public AliveMario(Life rest) {
		if (rest.getRest() == 0) {
			throw new GameOverException();
		}
		this.rest = rest;
	}

	public Mario getFlower() {
		return new FireMario(rest);
	}

	public Mario getMushroom() {
		return new SuperMario(rest);
	}

	public Mario getStar() {
		return new StarMario(rest, this);
	}

	public Mario currentMario() {
		return this;
	}

	public Mario fallHole() {
		return new DeadMario(rest);
	}

	public Mario getOneUpMashroom() {
		rest.countUp();
		return this;
	}

	protected Life getRest() {
		return rest;
	}

}
