package com.HackerRankChallenges.Implementation;
import java.util.*;


public class MigratoryBirds {
	public int frequency(int[] a){
		int total = 0;
		HashMap<Integer, Integer> IDFreq = new HashMap<Integer, Integer>();
		
		for(int i = 1; i<=5; i++){
			IDFreq.put(i, 0);
		}
		
		for(int i = 0; i<a.length; i++){
			int getID = IDFreq.get(a[i]);
			getID++;
			IDFreq.put(a[i], getID);
			
			if(getID > total) total = getID;
			
			
		}
		
		return total;
		
		
		
	}
}
