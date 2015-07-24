package com.miyamasa.mario.state.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

import com.miyamasa.mario.state.MarioState;

public class Star implements MarioState {

	private final LocalDateTime startTime;
	private MarioState previousMario;

	public Star(MarioState previousMario) {
		this.startTime = LocalDateTime.now();
		this.previousMario = previousMario;
	}

	public MarioState eatFlower() {
		return behave(e -> e.eatFlower());
	}

	public MarioState eatMushroom() {
		return behave(e -> e.eatMushroom());
	}

	public MarioState eatStar() {
		return behave(e -> e.eatStar());
	}

	public MarioState hitEnemy() {
		return behave(e -> e.hitEnemy());
	}

	public MarioState fallHole() {
		throw new DeadException();
	}

	public MarioState eatOneUpMashroom() {
		return behave(e -> e.eatOneUpMashroom());
	}

	private MarioState behave(Function<MarioState, MarioState> consumer) {
		LocalDateTime now = LocalDateTime.now();
		MarioState targetMario = this;
		if (ChronoUnit.SECONDS.between(startTime, now) > 30) {
			targetMario = this.previousMario;
		}
		return consumer.apply(targetMario);
	}
}
