package com.miyamasa.mario;

import com.miyamasa.mario.state.MarioState;

public class Mario {
	private MarioState state;
	// 自分が属するマリオホルダー(残機管理)
	private final MarioHolder marioHolder;

	public Mario(MarioState initialState, MarioHolder marioHolder) {
		this.state = initialState;
		this.marioHolder = marioHolder;
	}

	public Mario getOneUpMashroom() {
		this.state = state.getOneUpMashroom();
		marioHolder.addMario();
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

	public Class<? extends MarioState> getStateClass() {
		return this.state.getClass();
	}
}
