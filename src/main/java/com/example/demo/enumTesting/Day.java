package com.example.demo.enumTesting;

public enum Day {
    MONDAY("monday"),
    TUESDAY ("tuesday");




    private final String day;


    Day(String day) {
        this.day = day;
    }


    public  String getDay() {
        return day;
    }
}
