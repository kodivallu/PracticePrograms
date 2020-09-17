package com.goomo.practice;

public class SingletonDesignPatternInMultiThreadedEnvironment {
	
	private static volatile SingletonDesignPatternInMultiThreadedEnvironment INSTANCE;
	
	private SingletonDesignPatternInMultiThreadedEnvironment(){
		
	}
	
      public static SingletonDesignPatternInMultiThreadedEnvironment getInstance(){
    	  
    	  synchronized(SingletonDesignPatternInMultiThreadedEnvironment.class){
    		  if(INSTANCE == null){
    			  INSTANCE = new SingletonDesignPatternInMultiThreadedEnvironment();
    		  }
    	  }
    	  return INSTANCE;
	
	
     }
	
	
}
