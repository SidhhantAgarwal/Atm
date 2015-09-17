package com.assignment.main;

/**
 * Holds the logic for the initial configuration of the
 * bank. The users with some basic details are listed in a
 * file. The data from the file is read and the initial
 * settings are initialized. The class is a singleton
 * instance.
 * 
 * 
 * @author sidhhant
 *
 */
public class GlobalConfig {

    /**
     * Singleton instance of the class which will be the
     * same across the entire instance of the application.
     */
    private static GlobalConfig instance = new GlobalConfig();

    /**
     * The constructor made private
     */
    private GlobalConfig() {

    }

    /**
     * 
     * The static method which will be called to get the
     * singleton instance of the class
     * 
     * @return the instance in the form of
     *         {@link GlobalConfig}
     */
    public static GlobalConfig getInstance() {
	return instance;

    }

}
