package com.miyamasa.mario.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import com.miyamasa.mario.life.Life;
import com.miyamasa.mario.state.MarioState;
import com.miyamasa.mario.state.impl.MiniMario;

public class MarioTest {

	@Test
	public void test_() throws InterruptedException {
		Life rest = new Life(5);
		MarioState miniMario = new MiniMario(rest);
		MarioState starMario = miniMario.getFlower().getMushroom()
				.getOneUpMashroom().getStar();

		assertThat(rest.getRest(), is(equalTo(6)));

		Thread.sleep(11000);

	}

}
