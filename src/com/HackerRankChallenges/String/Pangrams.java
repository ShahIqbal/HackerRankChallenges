package com.HackerRankChallenges.String;

public class Pangrams {
	public void Pangram(String pan) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //Scanner nw = new Scanner(System.in);
        String x = pan;
        //System.out.println(x);
        x = x.toLowerCase();
        x = x.trim();
        
        //System.out.println(x);
        
        
        //System.out.println(x);
        
        if(x.contains("a") && x.contains("b") && x.contains("c") && x.contains("d") && x.contains("e") && x.contains("f") && x.contains("g") && x.contains("h") && x.contains("i") && x.contains("j") && x.contains("k") && x.contains("l") && x.contains("m") && x.contains("n") && x.contains("o") && x.contains("p") && x.contains("q") && x.contains("r") && x.contains("s") && x.contains("t") && x.contains("u") && x.contains("v") && x.contains("w") && x.contains("x") && x.contains("y") && x.contains("z")){
            
            System.out.println("pangram");
        
        } else {
            System.out.println("not pangram");
        }
        
    }
}
