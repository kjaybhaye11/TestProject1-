package zz11;


import java.util.Arrays;
import java.util.Collections;

public class ARRSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};   
		// sorts array[] in descending order   
		Arrays.sort(array, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(array));  
	
		
		
		
		/*for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
				
			{
				int temp=0;
				if(a[i]<a[j])
				{
				
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
		}*/
	}

}
