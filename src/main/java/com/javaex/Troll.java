package com.javaex;

import java.util.Locale;

public class Troll {
    public static String disemvowel(String str){
//     String strLowerCase=  str.replace("A", "a").replace("E", "e").replace("I","i").replace("O","o").replace("U","u");
//     String dsmvwl = strLowerCase.replace("a", "").replace("e","").replace("o","").replace("i","").replace("u","");
//       return dsmvwl;
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
