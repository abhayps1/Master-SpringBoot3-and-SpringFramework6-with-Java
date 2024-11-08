package com.aps.configs;

import org.springframework.stereotype.Component;

import com.aps.games.Game;

@Component
public class GameRunner {
	private Game game;

	public GameRunner(Game game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
