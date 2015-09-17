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
     * This field will be used to check whether a user is
     * holding a valid session.
     */
    private static boolean isSession;

    /**
     * This field denotes the currency type to be used in
     * the transactions.
     */
    private static String currencyType;

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

    /**
     * This method will load initial settings of the
     * application.
     */
    public void loadInitialSettings() {

    }

    /**
     * The getter method for isSession field.
     * 
     * @return session in the form of boolean.
     */
    public static boolean isSession() {
	return isSession;
    }

    /**
     * The setter method for isSession field.
     * 
     * @param isSession
     */
    public static void setSession(boolean isSession) {
	GlobalConfig.isSession = isSession;
    }

    public static String getCurrencyType() {
	return currencyType;
    }

    public static void setCurrencyType(String currencyType) {
	GlobalConfig.currencyType = currencyType;
    }

}
