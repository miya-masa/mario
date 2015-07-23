package com.miyamasa.mario;

import java.util.stream.IntStream;

import com.miyamasa.mario.stage.Stage;
import com.miyamasa.mario.stage.type.Ground;

public class Game {

	private static final int INITIAL_LIFE = 5;

	public static void main(String[] args) {
		new Game().start();

	}

	private void start() {

		Stage stage = new Stage(new Ground());

		MarioHolder holder = new MarioHolder(INITIAL_LIFE, stage);

		IntStream.iterate(0, i -> i + 1).limit(5).forEach(e -> {

			Mario mario = holder.popMario();
			mario.fallHole();

		});

	}
}
