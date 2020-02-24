package javaExmp;

import java.util.Arrays;

public class MoveZerosFromLeftToRight {

	public static void main(String[] args) {
		int array[]= {1,0,5,6,9,0,4,0,3,0,6,0,6};
		
		int counter=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter++;
			}
		}
		 while (counter < array.length)
	        {
	            array[counter] = 0;
	 
	            counter++;
	        }
	 
	        System.out.println(Arrays.toString(array));
	    }
	}


