package com.javaex;

import java.util.*;

public class Banjo {
        public static String areYouPlayingBanjo(String name) {
            // Program me!

            for(int i=0; i<name.length(); i++){
                if(name.charAt(0)=='r' || name.charAt(0)=='R'){
                    return name + " plays banjo";}
            }
            return name + " does not play banjo";
        }
        }
