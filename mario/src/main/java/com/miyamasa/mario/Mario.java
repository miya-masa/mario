package com.miyamasa.mario;

import lombok.NonNull;
import lombok.Setter;

import com.miyamasa.mario.stage.type.Stage;
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

	public String getStateName() {
		return this.state.getClass().getSimpleName();
	}
}
