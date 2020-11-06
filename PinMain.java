package A1;

//File Name: <<PinMain.java>>
//Developer: <<Jonathan Bernard Bloch>>
//Purpose: <<Prompts the user to enter the initialized value of the pin and then the new pin using the methods in Pin.java>> 
//Inputs: <<Old pin and new Pin>>
//Outputs: <<The results of each method>>
//Modifications: None
//=================================================================================================================================
//January 11 2018 until January 21 2018 <<Consists of a main method, enter_Old_Pin and enter_New_Pin method>>

import java.util.Scanner;

class PinMain 
{
	//Name: main
	//Developer: Jonathan Bernard Bloch
	//Purpose: Start execution of program.
	//Input: a string array
	//Outputs: None
	//Side effects: None
	//Special notes: None
	public static void main(String args[])
	{	
		Pin currentPin = new Pin();
		
		System.out.println("Welcome to pin update!");

		enter_Old_Pin(currentPin);
	}
	
	//Name: enter_Old_Pin
	//Developer: Jonathan Bernard Bloch
	//Purpose: Prompts the user to enter old pin which is "00"
	//Input: An instance of class Pin
	//Outputs: None
	//Side effects: If user enters "00", then a print statement "old pin confirmed" executes. Otherwise, a print statement "This is not your old pin executes." 
	//Special notes: None
	static void enter_Old_Pin(Pin currentPin)
	{	
		String inputPin = "";

		//Create a Scanner object for keyboard input
		Scanner in = new Scanner(System.in);

		while(!(currentPin.getPin().equals(inputPin)))
		{
			System.out.print("Please input your old pin: ");
			inputPin = in.nextLine();
					
			if(currentPin.getPin().equals(inputPin)) 
				System.out.println("Old pin confirmed.");
			else System.out.println("This is not your old pin.");
		}
		
		enter_New_Pin(currentPin);
	}
	
	//Name: enter_New_Pin
	//Developer: Jonathan Bernard Bloch
	//Purpose: Prompts the user to enter a 2-digit pin number different from the current pin
	//Input: An instance of class Pin
	//Outputs: None
	//Side effects: If user does not enter a 2 digit pin, and if the user enters "00", then a print statement "Invalid pin" executes. Otherwise, 2 print statements "New pin confirmed." and "Your pin has been updated to " currentPin.getPin() execute 
	//Special notes: None
	static void enter_New_Pin(Pin currentPin)
	{		
		String newPin = "";
		
		Scanner in = new Scanner(System.in);	
		
		do{
			System.out.print("Please input your new pin: ");

			newPin = in.nextLine();
			
			currentPin.changePin(newPin);
			
			if(currentPin.getPin().equals("00") || !(currentPin.getPin().equals(newPin)))	
				System.out.println("Invalid Pin.");
			else
			{
				System.out.println("New pin confirmed");
				System.out.println("Your pin has been updated to " + currentPin.getPin());
				break;
			}

		}while(true);
	}
}