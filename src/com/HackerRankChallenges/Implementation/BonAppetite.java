package com.HackerRankChallenges.Implementation;

import java.util.Scanner;

public class BonAppetite {
	
	//https://www.hackerrank.com/challenges/bon-appetit
	
	public void solution() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int i = 0; i<n; i++){
            c[i] = in.nextInt();
        }
        int b = in.nextInt();
        
        int total = 0;
        
        for(int j = 0; j<n; j++){
            if(j != k){
                total = total + c[j];
            }
        }
        
        if(total/2 == b){
            System.out.println("Bon Appetit");
        } else {
            int x = total + c[k];
            x = x/2;
            
            System.out.println(x - total/2);
        }
    }
}
