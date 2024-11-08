package com.aps.games;

public class MarioGame implements Game {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("Go into hold");

	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

	@Override
	public void right() {
		System.out.println("Accelerate");

	}

}
