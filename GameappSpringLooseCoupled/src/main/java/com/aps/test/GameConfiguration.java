package com.aps.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

	@Bean
	public Game game() {
		return new PacmanGame();
	}

	@Bean
	public GameRunner gameRunner(Game game) {
		return new GameRunner(game);
	}
}
