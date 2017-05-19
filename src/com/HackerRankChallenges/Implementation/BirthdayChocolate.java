package com.HackerRankChallenges.Implementation;

public class BirthdayChocolate {
	//   https://www.hackerrank.com/challenges/the-birthday-bar
	
	static int getWays(int[] squares, int d, int m){
        // Complete this function
        
        int count = 0;
        for(int i = 0; i <= squares.length - m; i++){
            
            int x = 0;
            
            for(int j = i; j<m+i; j++){
                
                x = x + squares[j];
            }
            
            if(x == d){
                count++;
            }
        }
        
        return count;
    }
	
}
