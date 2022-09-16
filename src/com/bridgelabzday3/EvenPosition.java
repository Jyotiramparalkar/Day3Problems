package com.bridgelabzday3;

public class EvenPosition 
{
	
	    public static void main(String[] args) 
	    {  
	  
	        int [] arr = new int [] {10, 20, 33, 84, 105};  
	  
	        System.out.println("Numbers of given array present on even position: ");    
	        for (int i = 1; i < arr.length; i = i+2) 
	        {  
	            System.out.println(arr[i]);  
	        }  
	    }  
	}  