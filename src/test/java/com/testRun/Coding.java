package com.testRun;

import java.util.ArrayList;
import java.util.List;

public class Coding {

	
	
	public static void main(String[] args) {		
	
		
		
		int[] myArray = {2,3,40,5,6,7,8};
		System.out.println("The first value is " + myArray[0]);
		System.out.println("The second value is " + myArray[1]);
		System.out.println("The last value is " + myArray[myArray.length-1]);
		
		int maxValue = myArray[0];
		
		for(int i=0; i<myArray.length; i++) {
			
			if(myArray[i]>maxValue) {maxValue= myArray[i]; }
			
		}
		
		System.out.println("The max value is " + maxValue);
		//List
		List <String> myList9 = new ArrayList<>();//ArrayList , LD,Vector, Stack
		//ctrl shift o		
		myList9.add("USA");
		myList9.add("UK");
		System.out.println(myList9);
		System.out.println("The size of my list is : " + myList9.size());
		System.out.println("First value is : " + myList9.get(0));
		System.out.println("Last value is : " + myList9.get(myList9.size()-1));

	}
}
