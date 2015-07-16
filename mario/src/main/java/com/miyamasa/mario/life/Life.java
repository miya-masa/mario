package com.miyamasa.mario.life;

public class Life {
	private int rest;

	public Life(int initialLife) {
		this.rest = initialLife;
	}

	public void countDown() {
		rest = rest - 1;
	}

	public void countUp() {
		rest = rest + 1;
	}

	public int getRest() {
		return rest;
	}
}
