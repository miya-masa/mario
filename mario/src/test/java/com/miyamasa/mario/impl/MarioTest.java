package com.miyamasa.mario.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.stream.IntStream;

import org.junit.Test;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.MarioHolder;
import com.miyamasa.mario.state.impl.Dead;
import com.miyamasa.mario.state.impl.Fire;
import com.miyamasa.mario.state.impl.Mini;
import com.miyamasa.mario.state.impl.Super;

public class MarioTest {

	@Test
	public void test_() throws InterruptedException {
		MarioHolder holder = new MarioHolder(5);
		IntStream.iterate(0, i -> i + 1).limit(5).forEach(i -> {
			Mario mario = holder.popMario();
			mario.getFlower();
			assertThat(mario.getStateClass(), equalTo(Fire.class));
			mario.hitEnemy();
			assertThat(mario.getStateClass(), equalTo(Super.class));
			mario.hitEnemy();
			assertThat(mario.getStateClass(), equalTo(Mini.class));
			mario.hitEnemy();
			assertThat(mario.getStateClass(), equalTo(Dead.class));
		});
		;

	}
}
