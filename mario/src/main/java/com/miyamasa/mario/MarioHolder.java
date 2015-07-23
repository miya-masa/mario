package com.miyamasa.mario;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

import com.miyamasa.mario.exception.GameOverException;
import com.miyamasa.mario.state.impl.Mini;

public class MarioHolder {

	private final Queue<Mario> marioList;

	public MarioHolder(int initialLife, Stage currentStage) {
		marioList = new LinkedBlockingQueue<Mario>();
		IntStream
				.iterate(0, i -> i + 1)
				.limit(initialLife)
				.forEach(
						e -> this.addMario(new Mario(new Mini(), currentStage)));
	}

	public Mario popMario() {
		Mario mario = marioList.poll();
		if (mario == null) {
			throw new GameOverException();
		}
		return mario;
	}

	public void addMario(Mario mario) {
		marioList.add(mario);
	}

}
