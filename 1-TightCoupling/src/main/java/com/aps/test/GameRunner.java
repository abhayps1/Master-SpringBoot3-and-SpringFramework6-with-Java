package com.aps.test;

public class GameRunner {
	private MarioGame marioGame;

	public GameRunner(MarioGame marioGame) {
		this.marioGame = marioGame;
	}

	public void run() {
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
	}

}
