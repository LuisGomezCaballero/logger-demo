package com.luisgomezcaballero.logger_demo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
	
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {

		LogManager.getLogManager().reset();

		LOGGER.setLevel(Level.CONFIG);

		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		LOGGER.addHandler(consoleHandler);
		
		LOGGER.log(Level.SEVERE, "Test");
		LOGGER.log(Level.WARNING, "Test");
		LOGGER.log(Level.INFO, "Test");
		LOGGER.log(Level.CONFIG, "Test");
		LOGGER.log(Level.FINE, "Test");
		LOGGER.log(Level.FINER, "Test");
		LOGGER.log(Level.FINEST, "Test");

	}

}
