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
        String Day = "Day";
        int Day1 = myCal.get(Calendar.DAY_OF_WEEK);
        if (Day1 == 1) {
            Day = "Sunday";
        }
        if (Day1 == 2) {
            Day = "Monday";
        }
        if (Day1 == 3) {
            Day = "Tuesday";
        }
        if (Day1 == 4) {
            Day = "Wednesday";
        }
        if (Day1 == 5) {
            Day = "Thursday";
        }
        if (Day1 == 6) {
            Day = "Friday";
        }
        if (Day1 == 7) {
            Day = "Saturday";
        }

        System.out.println("Today's date is: " + Month + "/" + Date + "/" + Year + " and the day of the week is: " + Day + ".");


        myCal.add(Calendar.DAY_OF_YEAR,100);

        int Month2 = myCal.get(Calendar.MONTH) + 1;
        int Date2 = myCal.get(Calendar.DAY_OF_MONTH);
        int Year2 = myCal.get(Calendar.YEAR);
        int Day2 = myCal.get(Calendar.DAY_OF_WEEK);
        if (Day2 == 1) {
            Day = "Sunday";
        }
        if (Day2 == 2) {
            Day = "Monday";
        }
        if (Day2 == 3) {
            Day = "Tuesday";
        }
        if (Day2 == 4) {
            Day = "Wednesday";
        }
        if (Day2 == 5) {
            Day = "Thursday";
        }
        if (Day2 == 6) {
            Day = "Friday";
        }
        if (Day2 == 7) {
            Day = "Saturday";
        }


        System.out.println("100 days from today the date will be: " + Month2 + "/" + Date2 + "/" + Year2 + " and the day of the week will be: " + Day + ".");

        while (myCal.get(Calendar.YEAR) < 2020){
            myCal.add(Calendar.DAY_OF_YEAR, 1);
        }
        while (myCal.get(Calendar.YEAR) > 2020){
            myCal.add(Calendar.DAY_OF_YEAR, -1);
        }
        while (myCal.get(Calendar.MONTH) > 4){
            myCal.add(Calendar.DAY_OF_YEAR, -1);
        }
        while (myCal.get(Calendar.MONTH) < 4){
            myCal.add(Calendar.DAY_OF_YEAR, 1);
        }
        while (myCal.get(Calendar.DAY_OF_MONTH) > 10){
            myCal.add(Calendar.DAY_OF_YEAR, -1);
        }
        while (myCal.get(Calendar.DAY_OF_MONTH) < 10){
            myCal.add(Calendar.DAY_OF_YEAR, 1);
        }

        int Month3 = myCal.get(Calendar.MONTH) + 1;
        int Date3 = myCal.get(Calendar.DAY_OF_MONTH);
        int Day3 = myCal.get(Calendar.DAY_OF_WEEK);

            if (Day3 == 1) {
                Day = "Sunday";
            }
            if (Day3 == 2) {
                Day = "Monday";
            }
            if (Day3 == 3) {
                Day = "Tuesday";
            }
            if (Day3 == 4) {
                Day = "Wednesday";
            }
            if (Day3 == 5) {
                Day = "Thursday";
            }
            if (Day3 == 6) {
                Day = "Friday";
            }
            if (Day3 == 7) {
                Day = "Saturday";
            }

        System.out.println("My birthday is: " + Month3 + "/" + Date3 + " and this year was on the day of the week of " + Day + " in the year 2020.");

        myCal.add(Calendar.DAY_OF_YEAR, 10000);

        int Month4 = myCal.get(Calendar.MONTH) + 1;
        int Date4 = myCal.get(Calendar.DAY_OF_MONTH);
        int Year4 = myCal.get(Calendar.YEAR);
        int Day4 = myCal.get(Calendar.DAY_OF_WEEK);
        if (Day4 == 1) {
            Day = "Sunday";
        }
        if (Day4 == 2) {
            Day = "Monday";
        }
        if (Day4 == 3) {
            Day = "Tuesday";
        }
        if (Day4 == 4) {
            Day = "Wednesday";
        }
        if (Day4 == 5) {
            Day = "Thursday";
        }
        if (Day4 == 6) {
            Day = "Friday";
        }
        if (Day4 == 7) {
            Day = "Saturday";
        }

        System.out.println("10,000 days from my 2020 birthday the date will be: " + Month4 + "/" + Date4 + "/" + Year4 + " and the day of the week will be: " + Day + ".");


    }

}