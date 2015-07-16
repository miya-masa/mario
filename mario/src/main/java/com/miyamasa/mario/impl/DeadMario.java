package com.miyamasa.mario.impl;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.exception.DeadException;
import com.miyamasa.mario.life.Life;

public class DeadMario implements Mario {

	public DeadMario(Life rest) {
		rest.countDown();
	}

	public Mario getFlower() {
		throw new DeadException();
	}

	public Mario getMushroom() {
		throw new DeadException();
	}

	public Mario getStar() {
		throw new DeadException();
	}

	public Mario hitEnemy() {
		throw new DeadException();
	}

	public Mario fallHole() {
		throw new DeadException();
	}

	public Mario getOneUpMashroom() {
		throw new DeadException();
	}

	public Mario currentMario() {
		return this;
	}

}
