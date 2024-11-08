package com.aps.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.aps.games", "com.aps.configs" })
public class GameConfiguration {

}
