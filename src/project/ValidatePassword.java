
package project;


public class ValidatePassword {
    public static String PassCheck (String Password) {

		String result = "Valid";			// Sets the initial result as valid
		int length = 0;						// Stores the number characters in the password
		int numCount = 0;					// Variable used to store numbers in the password
		int capCount = 0;					// Variable used to store capital letters in the password


		for (int x =0; x < Password.length(); x++) {
			if ((Password.charAt(x) >= 47 && Password.charAt(x) <= 58) || (Password.charAt(x) >= 64 && Password.charAt(x) <= 91) ||
				(Password.charAt(x) >= 97 && Password.charAt(x) <= 122)) {
					//Keep the Password
				} else {
					result = "Password Contains Invalid Character!\n"
                                                + "password must have only numbers and "
                                                + "letters,\n\tatleast 2 Capital Letters\n\t"
                                                + "atleast 2 Numbers\n\tmore than 8 of length ";		//Checks that password contains only letters and numbers
				}

			if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {			// Counts the number of numbers
				numCount ++;
			}

			if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {			// Counts the number of capital letters
				capCount ++;
			}

			length = (x + 1);								// Counts the passwords length

		} // Ends the for loop

		if (numCount < 2){									// Checks that password contains two numbers
			result = "Not Enough Numbers in Password!\npassword "
                                + "must have only numbers and letters,\n\tatleast "
                                + " Capital Letters\n\tatleast 2 Numbers\n\tmore than 8 of length ";
		}

		if (capCount < 2) {									// Checks that password contains two capital letters
			result = "Not Enough Capital Letters in Password!\n"
                                + "password must have only numbers and letters,"
                                + "\n\tatleast 2 Capital Letters\n\tatleast 2"
                                + " Numbers\n\tmore than 8 of length ";
		}

		if (length < 8){									// Checks that password is long enough
			result = "Password is Too Short!\npassword must have "
                                + "only numbers and letters,\n\t\tatleast 2 Capital "
                                + "Letters\n\tatleast 2 Numbers\n\tmore than 8 of length ";
		}

			return (result);								// Returns the value of "result"

}
}
