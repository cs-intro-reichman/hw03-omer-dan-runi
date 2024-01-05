/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
    static int specialSundayCount = 0;

    static boolean lastDay = false;

	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0;

	 	while (!lastDay)
	 	{
	 		if (dayOfWeek == 1)
	 		{
	 			// System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
	 			if (dayOfMonth == 1)
	 			{
	 				specialSundayCount++;
	 			}
	 		}
	 		else
	 		{
	 			// System.out.println(dayOfMonth + "/" + month + "/" + year);
	 		}

	 		advance();

	 		debugDaysCounter++;
        }
	 	//// Write the necessary ending code here
		System.out.println("During the 20th century, " + specialSundayCount + " Sundays fell on the first day of the month");
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// Replace this comment with your code
	 		if (dayOfMonth == nDaysInMonth)
	 		{
	 			dayOfMonth = 1;
	 			if (month == 12)
	 			{
	 				month = 1;
	 				nDaysInMonth = nDaysInMonth(month, year);

	 				year++;
	 			}
	 			else 
 				{
 					month++;
 					nDaysInMonth = nDaysInMonth(month, year);
 				}
	 		}
	 		else
	 		{
	 			dayOfMonth++;
	 		}

	 		if (dayOfWeek < 7)
	 		{
	 			dayOfWeek++;
	 		}
	 		else
	 		{
	 			dayOfWeek = 1;
	 		}

	 		if (year == 2000)
	 		{
	 			lastDay = true;
	 		}

	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
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
	private static int nDaysInMonth(int month, int year) {
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
