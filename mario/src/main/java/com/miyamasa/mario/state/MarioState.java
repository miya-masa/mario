package com.miyamasa.mario.state;

public interface MarioState {

	/**
	 * ワンアップキノコを食べた時
	 *
	 * @return 次のマリオ
	 */
	MarioState getOneUpMashroom();

	/**
	 * 花を取得する
	 *
	 * @return 次のマリオ
	 */
	MarioState getFlower();

	/**
	 * キノコを取得
	 *
	 * @return 次のマリオ
	 */
	MarioState getMushroom();

	/**
	 * スターを取得
	 *
	 * @return 次のマリオ
	 */
	MarioState getStar();

	/**
	 * 敵に当たる
	 *
	 * @return 敵
	 */
	MarioState hitEnemy();

	/**
	 * 穴に落ちる。
	 *
	 * @return 次のマリオ
	 */
	MarioState fallHole();

}
