package com.goomo.practice;

public class StringPractice extends Thread{
	
	 static private int voters=0;
	
	int totalVotesrs;
	
	private static synchronized int count(){
		
		return ++voters;
		
	}
    public void run(){
    	totalVotesrs =count();
    	System.out.println(totalVotesrs);
    }
	
    

}
