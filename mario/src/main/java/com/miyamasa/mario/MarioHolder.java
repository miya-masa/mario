package com.miyamasa.mario;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

import com.miyamasa.mario.state.impl.MiniMario;

public class MarioHolder {

	private final Queue<Mario> marioList;

	public MarioHolder(int initialLife) {
		marioList = new ArrayBlockingQueue<>(initialLife);
		Stream.iterate(0, i -> i + 1).limit(initialLife).forEach(i -> marioList.add(new Mario(new MiniMario())));
	}

	public Mario popMario() {
		return marioList.poll();
	}

	public void addMario() {
		marioList.add(new Mario(new MiniMario()));
	}

}
