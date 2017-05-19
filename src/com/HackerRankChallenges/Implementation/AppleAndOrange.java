package com.HackerRankChallenges.Implementation;

import java.util.Scanner;

public class AppleAndOrange {
	/*
	 Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, 
	 the red region denotes his house, where  is the start point and  is the end point.
	 The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are 
	 located on a single point, where the apple tree is at point  and the orange tree is at point .

		When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. 
		A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  
		units to the tree's right.
		
		Given the value of  for  apples and  oranges, can you determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range )? Print the number of apples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of output.
		
		Input Format
		
		The first line contains two space-separated integers denoting the respective values of  and . 
		The second line contains two space-separated integers denoting the respective values of  and . 
		The third line contains two space-separated integers denoting the respective values of  and . 
		The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point . 
		The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .
		*/

	    public void count(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        
	        int countA = 0;
	        int countO = 0;
	        
	        int[] apple = new int[m];
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	            int x = apple[apple_i] + a;
	            if(x > s && x < t){
	                countA++;
	            } else if(x == s || x == t){
	                countA++;
	            } else {
	                
	            }
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	            int y = orange[orange_i] + b;
	            if(y > s && y < t){
	                countO++;
	            } else if(y == s || y == t){
	                countO++;
	            } else {
	                
	            }
	        }
	        
	        System.out.println(countA);
	        System.out.println(countO);
	        
	        
	        
	    }
}




