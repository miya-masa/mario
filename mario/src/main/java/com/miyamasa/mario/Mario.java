package com.miyamasa.mario;

import lombok.NonNull;
import lombok.Setter;

import com.miyamasa.mario.stage.Stage;
import com.miyamasa.mario.state.MarioState;

public class Mario {

	@NonNull
	private MarioState state;
	@NonNull
	@Setter
	private Stage currentStage;

	public Mario(MarioState initialState, Stage currentStage) {
		this.state = initialState;
		this.currentStage = currentStage;
	}

	public Mario eatOneUpMashroom() {

		this.state = state.eatOneUpMashroom();
		return this;
	}

	public Mario eatFlower() {
		this.state = state.eatFlower();
		return this;
	}

	public Mario eatMushroom() {
		this.state = state.eatMushroom();
		return this;
	}

	public Mario eatStar() {
		this.state = state.eatStar();
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

	public String getStateName() {
		return this.state.getClass().getSimpleName();
	}
}
