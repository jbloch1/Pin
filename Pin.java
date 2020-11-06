package A1;

//File Name: <<Pin.java>>
//Developer: <<Jonathan Bernard Bloch>>
//Purpose: <<To store the current pin and methods that will be used throughout in Pinmain.java and in PinTest.java.>> 
//Inputs: <<None>>
//Outputs: <<The results of each method>>
//Modifications: None
//=================================================================================================================================
//January 11 2018 until January 21 2018 <<Stores the current pin and methods that will be used throughout in Pinmain.java and in PinTest.java.>>

class Pin 
{

	private String current_Pin;

	//Name: Pin
	//Developer: Jonathan Bernard Bloch
	//Purpose: Initializes current_Pin to "00"
	//Inputs: None
	//Outputs: None
	//Side-effect: Initializes current_Pin
	//Special notes: None
	Pin()
	{
		current_Pin = "00";
	}
			
	//Name: changePin
	//Developer: Jonathan Bernard Bloch
	//Purpose: Updates the pin to a new one
	//Input: a string 
	//Outputs: None
	//Side-effect: Changes value of current_Pin
	//Special notes: None
	protected void changePin(String new_Pin)
	{
		if(isValidPin(new_Pin) && !(current_Pin.equals(new_Pin)))
			current_Pin = new_Pin;
	}
	
	//Name: getPin
	//Developer: Jonathan Bernard Bloch
	//Purpose: Provides access to current_Pin from other classes
	//Inputs: None
	//Output: value of current_Pin
	//Side effects: None
	//Special notes: None
	protected String getPin()
	{
		return current_Pin;
	}
	
	//Name: IsValidPin
	//Developer: Jonathan Bernard Bloch
	//Purpose: Checks if the pin inserted by the user is a valid pin.
	//Input: a string
	//Outputs: true or false
	//Side effects: None
	//Special notes: None
	private boolean isValidPin(String new_Pin)
	{	
		//If the new pin is a two digit number then return true
		if(new_Pin.length() == 2 && Character.isDigit(new_Pin.charAt(0)) && Character.isDigit(new_Pin.charAt(1)))
			return true;
		else return false;	//Otherwise return false 
	}
}