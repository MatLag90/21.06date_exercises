package pl.sdaacademy;

import java.time.LocalDate;

public class Date {

    private int day;
    private int mounth;
    private int year;

    public Date(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMounth() {
        return mounth;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getDay() + "." + getMounth() + "." + getYear();
    }

    public boolean isLeapYear() {
        boolean isLeap = ((getYear() % 4 == 0) && (getYear() % 100 != 0)) || (getYear() % 400 == 0);
        return isLeap;
    }
    public int getCurrentMonthDaysCount(){
        

    }
}
