package com.bridgelabzday3;

public class SmallestNumInArray 
{
	
	
	  public static void main(String args[])
	  {

	     int arr[] = {12, 13, 1, 10, 34, 10};

	     int smallest = arr[0];

	     for(int i=0; i<arr.length; i++)
	     { 
	    	 if(smallest > arr[i])
	         {
	            smallest = arr[i];
	         }

	     }

	     System.out.println(smallest); 
	  }
	}

