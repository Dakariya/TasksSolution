package com.javaex;

public class DayOfWeek {
    public DayOfWeek(int n) {
    }

    public static String getDay(int n) {
        String day = switch (n) {
            case 1 -> "Sunday";
            case 2 -> ("Monday");
            case 3 -> ("Tuesday");
            case 4 -> ("Wednesday");
            case 5 -> ("Thursday");
            case 6 -> ("Friday");
            case 7 -> ("Saturday");
            default -> "Wrong, please enter a number between 1 and 7";
        };
        return day;
    }
}