package com.aps.games;

public class SupercontraGame implements Game {
	@Override
	public void up() {
		System.out.println("Up");

	}

	@Override
	public void down() {
		System.out.println("Sit down");

	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

	@Override
	public void right() {
		System.out.println("SHoot a bullet");

	}
}
