package javaExmp;

import java.util.Arrays;

public class MoveZerosFromRightToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,3,0,5,0,6,0,7,9,0,6,0};
		int counter=array.length-1;
		for(int i=array.length-1;i>=0;i--){
			if(array[i]!=0) {
				array[counter]=array[i];
				counter--;
			}
		}
		
		while(counter>=0) {
			array[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(array));

	}

}
