package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarySearch
 */
public class S668KthSmallestNumberInMultiplicationTable {

    public int findKthNumber(int m, int n, int k) {
        int a=1,b=m*n;
        while(a < b){
            int mid=a+(b-a)/2;
            if(mid == a) break;
            int cnt=0;
            for(int i=1;i<=m;++i){
                int q=mid/i;
                if(q==0) break;
                cnt +=Math.min(q,n);
                if(cnt >= k) break;
            }
            if(cnt < k){
                a=mid;
            }else if(cnt >= k){
                b=mid;
            }
        }
        return b;
    }

}
