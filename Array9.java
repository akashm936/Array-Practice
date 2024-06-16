// run status : true

import java.util.Scanner;

// finding the max element of an array

class Array9
{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter a size of array : ");
		 int size = sc.nextInt();

		 System.out.println("Enter An Element in an array");
		 int []arr = new int[size];

		 // for get input

		 for(int i=0;i<size;i++)
		 {
		 	arr[i]=sc.nextInt();
		 }

		 // output
         int max = arr[0]; // intialiy declare 0

		 for(int i=0;i<arr.length;i++)
		 {
            if(arr[i]>max)
            {
            	max = arr[i];
            }
		 }
		 System.out.println("The Max Element of an Array is  : "+ max);
	}
}


