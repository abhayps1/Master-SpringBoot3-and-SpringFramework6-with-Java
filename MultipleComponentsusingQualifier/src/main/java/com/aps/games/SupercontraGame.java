package com.aps.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SupercontraGameQualifier")
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
