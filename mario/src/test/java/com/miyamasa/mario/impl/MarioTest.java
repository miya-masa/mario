package com.miyamasa.mario.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import com.miyamasa.mario.Mario;
import com.miyamasa.mario.life.Life;

public class MarioTest {

	@Test
	public void test_() throws InterruptedException {
		Life rest = new Life(5);
		Mario miniMario = new MiniMario(rest);
		Mario starMario = miniMario.getFlower().getMushroom()
				.getOneUpMashroom().getStar();

		assertThat(rest.getRest(), is(equalTo(6)));

		Thread.sleep(11000);

	}

}
