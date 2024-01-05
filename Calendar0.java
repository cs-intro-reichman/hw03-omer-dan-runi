/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		// Replace this comment with your code
		// int commonYear = 2001;
		// int leapYear = 2000;
		// int curMonth = 2;

		for (int i = 1; i <= 12; i++)
		{
			System.out.println("Month " + i +" has " +  nDaysInMonth(i, year)) +" days");
		}

		// int nDaysInMonthTestCommon = nDaysInMonth(feb, commonYear);
		// int nDaysInMonthTestLeap = nDaysInMonth(feb, leapYear);

		// System.out.println("feburary in a common Year has " + nDaysInMonthTestCommon + " days");
		// System.out.println("feburary in a leap Year has " + nDaysInMonthTestLeap + " days");
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
	    if (year % 4 > 0)
	    {
			return false;
	    }

	    if (year % 100 == 0 && year % 400 != 0)
	    {
	    	return false;
	    }
		
		return true;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		int numDays = 0;
		switch (month)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;

				case 2:
					if (isLeapYear(year))
					{
						numDays = 29;
					}
					else 
					{
						numDays = 28;
					}
					break;

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;

		}
		return numDays;
	}
}


