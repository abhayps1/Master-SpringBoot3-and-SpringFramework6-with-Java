package com.aps.test;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var supercontraGame = new SupercontraGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}
}
