package JavaPrograms;

public class leapyear {

	public static void main(String[] args) {
		
		
		//Divisible  by 4 year for all year, ending with 00 , 2000,,1700
		//century  year is a leap year if it is perfectly divided by 400
		//1900 is leap year
		//2020 is leap year
		int year = 1900;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
	}

}
