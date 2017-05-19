package com.HackerRankChallenges.Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {
	
	//https://www.hackerrank.com/challenges/divisible-sum-pairs
	
	public void ifDivisible(int n, int k, int[] a) {
        
        // write your code here
        int count = 0;
        
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(((a[j] + a[i]) % k) == 0 ) count++;
            }
        }
        
        System.out.println(count);
        
    }
}
