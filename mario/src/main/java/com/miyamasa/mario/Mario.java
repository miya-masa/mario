package com.miyamasa.mario;

public interface Mario {

	/**
	 * ワンアップキノコを食べた時
	 *
	 * @return 次のマリオ
	 */
	Mario getOneUpMashroom();

	/**
	 * 花を取得する
	 *
	 * @return 次のマリオ
	 */
	Mario getFlower();

	/**
	 * キノコを取得
	 *
	 * @return 次のマリオ
	 */
	Mario getMushroom();

	/**
	 * スターを取得
	 *
	 * @return 次のマリオ
	 */
	Mario getStar();

	/**
	 * 敵に当たる
	 *
	 * @return 敵
	 */
	Mario hitEnemy();

	/**
	 * 穴に落ちる。
	 *
	 * @return 次のマリオ
	 */
	Mario fallHole();

}
