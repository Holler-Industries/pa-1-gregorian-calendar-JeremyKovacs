package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        //System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        //System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        int Month = myCal.get(Calendar.MONTH) + 1;
        int Date = myCal.get(Calendar.DAY_OF_MONTH);
        int Year = myCal.get(Calendar.YEAR);

        System.out.println("Today's date is: " + Month + "/" + Date + "/" + Year + ".");


        myCal.add(Calendar.DAY_OF_YEAR,100);

        int Month2 = myCal.get(Calendar.MONTH) + 1;
        int Date2 = myCal.get(Calendar.DAY_OF_MONTH);
        int Year2 = myCal.get(Calendar.YEAR);
        int Day2 = myCal.get(Calendar.DAY_OF_WEEK);

        System.out.println("100 days from today the date will be: " + Month2 + "/" + Date2 + "/" + Year2 + " and the day of the week will be: " + Day2 + ".");

        myCal.add(Calendar.DAY_OF_YEAR,-237);

        int Month3 = myCal.get(Calendar.MONTH) + 1;
        int Date3 = myCal.get(Calendar.DAY_OF_MONTH);
        int Day3 = myCal.get(Calendar.DAY_OF_WEEK);

        System.out.println("My birthday is: " + Month3 + "/" + Date3 + " and this year was on the day of the week of " + Day3 + ".");

        //This will not always be correct because the calendar is changing but my birthday is in the same place.
        //This is correct as of 9/24/2020.
        //The next print statement will also only be correct on 9/24/2020 for the same reason.

        myCal.add(Calendar.DAY_OF_YEAR, 10000);

        int Month4 = myCal.get(Calendar.MONTH) + 1;
        int Date4 = myCal.get(Calendar.DAY_OF_MONTH);
        int Year4 = myCal.get(Calendar.YEAR);

        System.out.println("10,000 days from my last birthday the date will be: " + Month4 + "/" + Date4 + "/" + Year4 + ".");


    }

}