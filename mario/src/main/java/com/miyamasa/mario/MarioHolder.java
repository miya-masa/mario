package com.miyamasa.mario;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

import com.miyamasa.mario.exception.GameOverException;
import com.miyamasa.mario.state.impl.Mini;

public class MarioHolder {

	private final Queue<Mario> marioList;

	public MarioHolder(int initialLife) {
		marioList = new ArrayBlockingQueue<>(initialLife);
		Stream.iterate(0, i -> i + 1).limit(initialLife)
				.forEach(i -> this.addMario());
	}

	public Mario popMario() {
		Mario mario = marioList.poll();
		if (mario == null) {
			throw new GameOverException();
		}
		return mario;
	}

	public void addMario() {
		marioList.add(new Mario(new Mini(), this));
	}

}
