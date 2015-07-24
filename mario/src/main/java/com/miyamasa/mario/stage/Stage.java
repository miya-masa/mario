package com.miyamasa.mario.stage;

import com.miyamasa.mario.stage.type.StageType;


public class Stage {

	private int totalTime = 100;

	private StageType stageType;

	public Stage(StageType stageType) {
		this.stageType = stageType;
	}

}
