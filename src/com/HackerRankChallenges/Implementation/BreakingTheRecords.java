package com.HackerRankChallenges.Implementation;

public class BreakingTheRecords {
	
	/*
	 *Maria plays n games of college basketball in a season. Because she wants to go pro, she tracks her points scored 
	 *per game sequentially in an array defined as s. 
	 *After each game , she checks to see if score  breaks her record for most or least points scored so far during that season.

		Given Maria's array of  for a season of  games, find and print the number of times she breaks her record 
		for most and least points scored during the season.
		
		Note: Assume her records for most and least points at the start of the season are the number of points
		 scored during the first game of the season. 
	 * 
	 
	 */
	public int[] getRecord(int[] s){
        // Complete this function
        int lowCount = 0;
        int highCount = 0;
        int low = s[0];
        int high = s[0];
        
        for(int i = 0; i < s.length; i++){
            if(s[i] > high){
                high = s[i];
                highCount++;
            }
            
            if(s[i] < low){
                low = s[i];
                lowCount++;
            }
        }
        
        int[] a = {highCount, lowCount};
        return a;
    }
}
