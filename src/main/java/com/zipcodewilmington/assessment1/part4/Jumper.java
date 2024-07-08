package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if (k < j){
            return k;
        } else if (k == j){
            return 1;
        }
        else if(k > j) {
            for (int i = j; i <= k; i++) {
                if (j + (i) > k) {
                    return i;
                } else{
                }
            }
        }

//            for (int i = j; i < k; i++){
//                if (i * counter < k){
//                    counter++;
//                } else {
//                    return j - (i * counter % k);
//                }
//            }
//            int howManyTimes = j%k;
//            return j - howManyTimes;


        return -1;
    }
}
