package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String subString1 = str.substring(0,1);
        String subString2 = str.substring(1,str.length());
        String subStringCap = subString1.toUpperCase();

        return subStringCap+subString2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder revStr = new StringBuilder(str);
        return revStr.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
       StringBuilder str2 = new StringBuilder(str);
       String str2Rev = str2.reverse().toString();
       String str2RevCap = camelCase(str2Rev);

        return str2RevCap;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String strRemovedEnds =  str.substring(1, str.length()-1);

        return strRemovedEnds;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] individualCharsAsStrings = str.split("");
        StringBuilder casedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (!individualCharsAsStrings[i].equals(individualCharsAsStrings[i].toUpperCase())){
                casedString.append(individualCharsAsStrings[i].toUpperCase());
            }
            else {
                casedString.append(individualCharsAsStrings[i].toLowerCase());
            }
        }

        return casedString.toString();
    }
}
