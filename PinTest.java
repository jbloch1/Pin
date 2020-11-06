package A1;

//File Name: <<PinTest.java>>
//Developer: <<Jonathan Bernard Bloch>>
//Purpose: <<Tests each method in Pin.java>> 
//Inputs: <<None>>
//Outputs: <<The results of each method>>
//Modifications: None
//=================================================================================================================================
//January 11 2018 until January 21 2018 <<Consists of a main method, and a tester method for the Pin constructor, ChangePin, and Equals_Current_Pin method.>>


class PinTest 
{
	//Name: main()
	//Developer: Jonathan Bernard Bloch
	//Purpose: Start execution of program.
	//Input: a string array
	//Outputs: None
	//Side effects: none
	//Special notes: none
	public static void main(String[] args)
	{
		System.out.println("Test case for TestPinConstructor");
		System.out.println("Output: " + testPinConstructor());
		
		System.out.println("Test case for changePin()");
		testChangePin();
	}

	//Name: main()
	//Developer: Jonathan Bernard Bloch
	//Purpose: Tests the Pin constructor 
	//Input: None
	//Outputs: True or False
	//Side effects: Returns true if current pin is "00" and returns false otherwise
	//Special notes: none
	static boolean testPinConstructor()
	{
		Pin pin = new Pin();
		
		String pinNum = pin.getPin();
		
		if(pinNum.equals("00")) return true; //Return true if current pin is 00
		else return false; //Return false if it isn't
	}
	
	//Name: TestChangePin()
	//Developer: Jonathan Bernard Bloch
	//Purpose: Tests the ChangePin() method
	//Input: None
	//Outputs: Print statements
	//Side effects: If the new pin is not "00" and is identical to the current pin then run print statement newPin "is a valid pin". Otherwise execute print statement newPin "is an invalid pin"
	//Special notes: None
	static void testChangePin()
	{
		Pin pin = new Pin();
		String newPin = "";
		String oldPin = "";
		
		for(int firstAsciiNum = 32; firstAsciiNum <= 127; firstAsciiNum++)
		{
			for(int secondAsciiNum = 32; secondAsciiNum <= 127; secondAsciiNum++)
			{
				System.out.println("Old Pin: " + pin.getPin());
				
				newPin = "" + (char)(firstAsciiNum) + (char)(secondAsciiNum);
				
				System.out.println("Input Pin: " + newPin);
				
				oldPin = pin.getPin();
				
				pin.changePin(newPin);

				System.out.println("New pin: " + pin.getPin());
				
				if(newPin.equals(oldPin) || !(pin.getPin().equals(newPin))) System.out.println(newPin + " is an invalid pin");
			}
		}
		
		//Everything else below this line until the end of this method is for any input to ChangePin.
		
		System.out.println("Old Pin: " + pin.getPin());
		
		newPin = "abc";	//User makes changes to newPin to test for values other than for what is obtained in the double for-loop.
		
		System.out.println("Input Pin: " + newPin);
		
		oldPin = pin.getPin();

		pin.changePin(newPin);
		
		System.out.println("New pin: " + pin.getPin());
		
		if(newPin.equals(oldPin) || !(pin.getPin().equals(newPin))) System.out.println(newPin + " is an invalid pin");
	}
}