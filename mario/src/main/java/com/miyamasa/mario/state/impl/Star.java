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

	public MarioState getFlower() {
		return behave(e -> e.getFlower());
	}

	public MarioState getMushroom() {
		return behave(e -> e.getMushroom());
	}

	public MarioState getStar() {
		return behave(e -> e.getStar());
	}

	public MarioState hitEnemy() {
		return behave(e -> e.hitEnemy());
	}

	public MarioState fallHole() {
		return new Dead();
	}

	public MarioState getOneUpMashroom() {
		return behave(e -> e.getOneUpMashroom());
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
