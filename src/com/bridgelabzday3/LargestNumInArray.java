package com.bridgelabzday3;

public class LargestNumInArray 
{

	    public static void main(String[] args) {
	        int[] arr = {3 , 4 , 55 ,12 , 10 , 26};
	        int largest = arr[0];

	        for (int num: arr) 
	        {
	            if(largest < num)
	                largest = num;
	        }

	        System.out.println(largest);
	    }
	}