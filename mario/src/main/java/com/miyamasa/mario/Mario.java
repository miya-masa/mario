package com.miyamasa.mario;

import com.miyamasa.mario.state.MarioState;

public class Mario {
	private MarioState state;

	public Mario(MarioState initialState) {
		this.state = initialState;
	}

	public Mario getOneUpMashroom() {
		this.state = state.getOneUpMashroom();
		return this;
	}

	public Mario getFlower() {
		this.state = state.getFlower();
		return this;
	}

	public Mario getMushroom() {
		this.state = state.getMushroom();
		return this;
	}

	public Mario getStar() {
		this.state = state.getStar();
		return this;
	}

	public Mario hitEnemy() {
		this.state = state.hitEnemy();
		return this;
	}

	public Mario fallHole() {
		this.state = state.fallHole();
		return this;
	}

}
