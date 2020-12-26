package com.company.oop;

// Imangali Kalybek

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    @Override
    public String toString() {
        String h = "", m = "", s = "";
        if (hour < 10) {
            h = "0";
        }
        if (minute < 10) {
            m = "0";
        }
        if (second < 10) {
            s = "0";
        }
        return h + hour + ":" + m + minute + ":" + s + second;
    }

    public String nextSecond() {
        second++;
        return toString();
    }

    public String previousSecond() {
        second--;
        return toString();
    }


}
