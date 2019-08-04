package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S1053PreviousPermutationWithOneSwap {

    //TODO 
    public int[] prevPermOpt1(int[] A) {
        for(int i = A.length - 2; i>=0; i--){
            if(A[i] > A[i+1]){

                int tmp_i = i+1;

                for(int j = i+2; j<A.length; j++){
                    if(A[j] < A[i] && A[j] > A[tmp_i]){
                        tmp_i = j;
                    }
                }

                int tmp = A[tmp_i];
                A[tmp_i] = A[i];
                A[i] = tmp;
                return A;

            }

        }
        return A;
        
    }

}
