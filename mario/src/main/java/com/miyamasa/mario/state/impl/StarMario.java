package com.miyamasa.mario.state.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

import com.miyamasa.mario.life.Life;
import com.miyamasa.mario.state.MarioState;

public class StarMario implements MarioState {

	private final Life rest;
	private final LocalDateTime startTime;
	private MarioState previousMario;

	public StarMario(Life rest, MarioState previousMario) {
		this.startTime = LocalDateTime.now();
		this.rest = rest;
		this.previousMario = previousMario;
	}

	public MarioState getFlower() {
		return currentMario(e -> e.getFlower());
	}

	public MarioState getMushroom() {
		return currentMario(e -> e.getMushroom());
	}

	public MarioState getStar() {
		return currentMario(e -> e.getStar());
	}

	public MarioState hitEnemy() {
		return currentMario(e -> e.hitEnemy());
	}

	public MarioState fallHole() {
		return new DeadMario(this.rest);
	}

	public MarioState getOneUpMashroom() {
		return currentMario(e -> e.getOneUpMashroom());
	}

	private MarioState currentMario(Function<MarioState, MarioState> consumer) {
		LocalDateTime now = LocalDateTime.now();
		MarioState targetMario = this;
		if (ChronoUnit.SECONDS.between(startTime, now) > 30) {
			targetMario = this.previousMario;
		}
		return consumer.apply(targetMario);
	}
}
