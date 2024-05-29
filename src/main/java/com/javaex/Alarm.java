package com.javaex;

public class Alarm {
    public static boolean alarmSet(boolean employed, boolean vacation){
        boolean result;
        if(employed == true && vacation==true) result = false;
        else if (employed==true && vacation==false) result=true;
        else if (employed==false && vacation==true) result=false;
        else result=false;

        return result;
    }
}
