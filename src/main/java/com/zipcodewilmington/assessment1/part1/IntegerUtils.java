package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int i = n; i > 0; i--){
            sum = sum + i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int product = 1;
        for (int i = n; i > 0; i--){
            product = product * i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String intString = Integer.toString(val);
        // i stole my code from the string utils reverse method i made in step 1;
        StringBuilder intStringSBRev = new StringBuilder(intString);
        String intStringRevRev = intStringSBRev.reverse().toString();

        return Integer.parseInt(intStringRevRev);
    }
}
