package myfirstjava;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		
	
	int[] arr = {1,2,3,5,7,6,8,10};
	Arrays.sort(arr);
	for(int i=arr[0];i<arr.length;i++)
	{
		if(i!=arr[i-1])
		{
			System.out.println(i);
			break;
		}
	}
	}
	}
 