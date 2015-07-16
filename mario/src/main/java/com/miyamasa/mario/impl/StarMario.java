package com.miyamasa.mario.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.life.Life;

public class StarMario implements Mario {

	private final Life rest;
	private final LocalDateTime startTime;
	private Mario previousMario;

	public StarMario(Life rest, Mario previousMario) {
		this.startTime = LocalDateTime.now();
		this.rest = rest;
		this.previousMario = previousMario;
	}

	public Mario getFlower() {
		return currentMario(e -> e.getFlower());
	}

	public Mario getMushroom() {
		return currentMario(e -> e.getMushroom());
	}

	public Mario getStar() {
		return currentMario(e -> e.getStar());
	}

	public Mario hitEnemy() {
		return currentMario(e -> e.hitEnemy());
	}

	public Mario fallHole() {
		return new DeadMario(this.rest);
	}

	public Mario getOneUpMashroom() {
		return currentMario(e -> e.getOneUpMashroom());
	}

	private Mario currentMario(Function<Mario, Mario> consumer) {
		LocalDateTime now = LocalDateTime.now();
		Mario targetMario = this;
		if (ChronoUnit.SECONDS.between(startTime, now) > 30) {
			targetMario = this.previousMario;
		}
		return consumer.apply(targetMario);
	}
}
