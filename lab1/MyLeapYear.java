public class MyLeapYear {
	
	/** This is a method to judge if the year is a 
		leap year or not.	
	*/
	public static boolean isLeapYear(int year) {
		/** a leap year is divisible by 400 */
		if (year % 400 == 0) {
			return true;
		/** a leap year is divisible by 4 and not by 100.	*/
		} else if (year % 4 == 0 && year % 100 != 0){
			return true;
		} else {
			return false;
		}
	}

	/** this is the main method.	*/
	public static void main(String[] args){
		/**	System.out.println("This is the input number: "+args[0]);	*/
		
		/**	conver the parameter args[0] from type of string to int.
			i_year is the int type of string args.
				*/
		String myString = args[0];
		int i_year = Integer.parseInt(myString);
		
		boolean result = isLeapYear(i_year);

		if (result == true) {
			System.out.println(i_year + " is a leap year.");
		}	else {
			System.out.println(i_year + " is not a leap year.");
		}
	}

}