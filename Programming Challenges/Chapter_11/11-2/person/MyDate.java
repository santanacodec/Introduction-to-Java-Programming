/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**10.14 (The MyDate class) Design a class named MyDate. The class contains:
■■ The data fields year, month, and day that represent a date. month is 0-based, 
i.e., 0 is for January.
■■ A no-arg constructor that creates a MyDate object for the current date.
■■ A constructor that constructs a MyDate object with a specified elapsed time 
since midnight, January 1, 1970, in milliseconds.
■■ A constructor that constructs a MyDate object with the specified year, month, 
and day.
■■ Three getter methods for the data fields year, month, and day, respectively.
■■ A method named setDate(long elapsedTime) that sets a new date for 
the object using the elapsed time.
**/

// MyDate by Ghost Henry http://soultionmanual.blogspot.com/2016/09/chapter-10-exercise-14-introduction-to.html


package person;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Edgar Santana
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate() {

        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);

    }

    public MyDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }
}