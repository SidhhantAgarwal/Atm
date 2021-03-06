package com.assignment.main;

import java.io.IOException;

/**
 * The main launcher class for the application.This class
 * will contain the main method. The application will ask
 * the user to enter a unique identifier and a pin, if the
 * pin is correct the user will be prompted to enter what
 * transaction does he want to perform.
 * 
 * @author sidhhant
 *
 */
public class Launcher {

    /**
     * The main method from where the application will be
     * launched.
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
	GlobalConfig config = GlobalConfig.getInstance();
	config.loadInitialSettings();

	MenuDisplay display = new MenuDisplay();
	display.displayLogin();

    }

}
