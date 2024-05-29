package com.javaex;


import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    private static final DecimalFormat df= new DecimalFormat("0.00");
    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println(DayOfWeek.getDay(8));
        System.out.println(Converter.mpgtoKPM(10));
        System.out.println(Alarm.alarmSet(true, false));
        System.out.println(Sid.simpleMultiplication(2));
        System.out.println(Troll.disemvowel("TRannaeyOAi"));
        System.out.println((Arrays.toString(RemoveElement.removeElem(new int[]{3,2,2,3}, 3))));
        System.out.println(Banjo.areYouPlayingBanjo("rick"));
        System.out.println();
        System.out.println("- Did Joffrey agree?\n- He did. He also said \"I'm using this \\n\"");
    }
 

}