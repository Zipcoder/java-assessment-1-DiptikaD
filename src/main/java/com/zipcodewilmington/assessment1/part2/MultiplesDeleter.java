package com.zipcodewilmington.assessment1.part2;

import org.junit.Assert;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
//        ArrayList<Integer> deletedEvens = new ArrayList<>();
//        for (int element : ints){
//            if (element > ints.length-1){
//                break;
//            }
//            else if (ints[element]%2 ==0){
//                continue;
//            } else {
//                deletedEvens.add(ints[element]);
//            }
//        }
//        return deletedEvens.toArray().toString();

        int evenOccurence = 0;
        for (int i : ints){
            if (!(i % 2 == 0)){
                evenOccurence++;
                }
        }
        Integer[] removedEvens = new Integer[evenOccurence];
        int i = -1;
        for (int element : ints) {
            if (!(element % 2 == 0)) {
                removedEvens[i + 1] = element;
                i++;

            }
        }
        return removedEvens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int oddOccurence = 0;
        for (int i : ints){
            if (i % 2 == 0) {
                oddOccurence++;
            }
        }
        Integer[] removedOdds = new Integer[oddOccurence];
        int i = -1;
        for (int element : ints) {
            if (element % 2 == 0) {
                removedOdds[i + 1] = element;
                i++;

            }
        }
        return removedOdds;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int noThreeMultOccurance = 0;
        for (int i : ints){
            if (i%3 != 0) {
                noThreeMultOccurance++;
            }
        }
        Integer[] removed3Multiples = new Integer[noThreeMultOccurance];
        int i = -1;
        for (int element : ints) {
            if (element % 3 != 0) {
                removed3Multiples[i + 1] = element;
                i++;

            }
        }
        return removed3Multiples;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int nOccurance = 0;
        for (int i : ints){
            if (i % multiple == 0) {
                nOccurance++;
            }
        }
        Integer[] removedMultiples = new Integer[nOccurance];
        int i = -1;
        for (int element : ints) {
            if (element % multiple != 0) {
                removedMultiples[i + 1] = element;
                i++;

            }
        }
        return removedMultiples;

    }
}
