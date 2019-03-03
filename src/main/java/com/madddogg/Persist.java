package com.madddogg;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.

 For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 */
class Persist {
    static int pers = 0;
    static boolean first = true;
    public static int persistence(long n) {
        if(Long.toString(n).length() == 1){
            first = true;
            int temp;
            temp = pers;
            pers = 0;
            return temp;
        }
        pers+=1;
        int mult = 1;
        String[]split = Long.toString(n).split("");
        for(int i=0; i<split.length; i++){
            mult*= Integer.parseInt(split[i]);
        }
        first = false;
        return persistence(mult);
    }
}