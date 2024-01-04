/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int nDaysInMonth = 31; // Number of days in January

    static boolean lastDay = false;

	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		int dayOfWeek = whatDay(year);     

	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    int debugDaysCounter = 0;

	 	while (!lastDay)
	 	{
	 		if (dayOfWeek == 0)
	 		{
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
	 		}
	 		else
	 		{
	 			System.out.println(dayOfMonth + "/" + month + "/" + year);
	 		}
			dayOfWeek = (dayOfWeek + 1) % 7;
	 		advance(year);

			

	 		debugDaysCounter++;
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance(int year) {
		// Replace this comment with your code
	 		if (dayOfMonth == nDaysInMonth)
	 		{
	 			dayOfMonth = 1;
	 			if (month == 12)
	 			{
	 				lastDay = true;
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
	 } 

	 private static int whatDay(int year){
	 	int countYear = 1900;
	 	int weekDay = 1; // 1.1.1900 was a Monday

		for (int i = 1900; i < year; i++)
	 	{
	 		if(isLeapYear(i))
			{
	 			weekDay ++;
	 		}

			weekDay++;
	 		countYear ++;
	 	}

	 	return (weekDay % 7);
	 }
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
		if (year % 4 != 0)
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
