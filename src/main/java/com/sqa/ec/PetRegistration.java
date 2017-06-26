/**
 * File Name: PetRegistration.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 22, 2017
 */
package com.sqa.ec;

import com.sqa.ec.helpers.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration
{

	private static String appName = "Pet Registration";

	private final static double REG_COST = 45.00;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName(appName);
		registerPets();
		AppBasics.fareWellUser(name);
	}

	private static void registerPets()
	{
		int numOfPets = AppBasics.requestIntWithinRange("How many pets would you like to register?", 1, 5, "You can only register 1 - 5 pets into the system at a time.");
		System.out.println("You are registering " + numOfPets + " pets.");
		char petSex = AppBasics.requestChar("What is the sex of your pet?", "You must provide an acceptable sex.", 'M', 'F');
		int numOfYears = AppBasics.requestIntWithinRange("How many years would you like to register your pet(s)?", 1, 10, "You can only register your pet(s) for 1 - 10 years");
		double totalRegistrationCost = numOfPets * numOfYears * REG_COST;
		System.out.printf("It will cost a total of %.2f to register your pet(s).", totalRegistrationCost);
	}
}
