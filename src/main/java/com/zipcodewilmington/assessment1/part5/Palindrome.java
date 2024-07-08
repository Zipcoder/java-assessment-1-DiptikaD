package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int length = input.length();
        int palindromeCounter = length;

        for(int i=0; i<length; i++) {
            for(int j=i+2; j<=length; j++) {
                String inputChar = input.substring(i, j);
                String reverse = new StringBuilder(inputChar).reverse().toString();
                if(inputChar.equals(reverse)) {
                    palindromeCounter++;
                }
            }
        }

        return palindromeCounter;


//        String[] inputChar = input.split("");
//        StringBuilder charSB = new StringBuilder(input);
//        int palindromeCounter = 0;
//        int j = 1;
//
//        for (int i = 0; i < inputChar.length; i++){
//            String[] temp = new String[]{inputChar[i]};
//
//            if (inputChar[i].equals(inputChar[i])){
//                palindromeCounter++;
//            }
//
//            if(i > 0 && temp[i].equals(inputChar[inputChar.length-j -1])){
//                palindromeCounter++;
//                j++;
//            }
//        }
//        return palindromeCounter;

//        for (int j = 0; j < inputChar.length; j++){
//
//        for (int i = 0; i < inputChar.length/2; i++) {
//            String[] temp = new String[]{inputChar[i]};
//            if(i > 0 && temp[i].equals(inputChar[inputChar.length-j-1])) {
//                palindromeCounter++;
//                palindromeCounter++;
//            } else {
//                palindromeCounter++;
//            }
//        }
//        }
//        return palindromeCounter;

//        String[] inputChar = input.split("");
//        StringBuilder charSB = new StringBuilder(input);
//        for (int i = 0; i < inputChar.length; i++){
//            for (int j = 0; j < inputChar[i].length(); i++){
//                String sBChar = charSB.charAt(i);
//                if(inputChar[i].equals(charSB.charAt(i))){}
//            }
//        }

//        String[] inputChar = input.split("");
//        int palinDromeCounter = 0;
//        int i = 0;
//        for (String element : inputChar){
//            if(i < inputChar.length && element.equals(inputChar[i])){
//                palinDromeCounter++;
//            } else if (i+1 < inputChar.length && inputChar[i].equals(inputChar[i+1])){
//                palinDromeCounter++;
//            } else {palinDromeCounter++;
//            }
//        }

//        for (int i = 0; i < inputChar.length; i++){
//            if(i > 0 && inputChar[i].equals(inputChar[i-1]) && inputChar[i].equals(inputChar[i+1])){
//                palinDromeCounter++;
//            } else if (i+1 < inputChar.length && inputChar[i].equals(inputChar[i+1])){
//                palinDromeCounter++;
//            } else {palinDromeCounter++;
//            }
//        }
//
// return null;
    }
}

