package com.goomo.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountWordsFromList {
	
	public static void main(String[] args) {
		
		
		List<String> list=new  ArrayList<>();
		
		list.add("manju");
		list.add("pratam");
		list.add("manju");
		
		Map<String,Integer> map=new  HashMap<>();
		
		for(String str : list){
			
		if(map.containsKey(str)){
			map.put(str, map.get(str)+1);
			
		}else{
			map.put(str, 1);
		}
			
		}
		
		Set<String> keySet = map.keySet();
		for(String s : keySet){
			System.out.println(s);
			System.out.println(map.get(s));
		}
		
	}
}
