package com.miyamasa.mario.stage;

import com.miyamasa.mario.stage.type.StageType;

import lombok.Getter;

public class Stage {

	@Getter
	private int totalTime = 100;

	private StageType stageType;

	public Stage(StageType stageType) {
		this.stageType = stageType;
	}

	public boolean isJumpable() {
		return stageType.isJumpable();
	}

	public boolean isSwimable() {
		return stageType.isSwimable();
	}

	public boolean isScrollable() {
		return stageType.isScrollable();
	}

}
