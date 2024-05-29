package com.javaex;

public class Converter {
     public static float mpgtoKPM(final float mpg){
         float gallon=4.54609188f;
         float mile=1.609344f;
         float kpl=(mpg*mile)/gallon;
         return (float) Math.round(kpl*100)/100;

     }
}
