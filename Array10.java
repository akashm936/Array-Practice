// run status : true

import java.util.Scanner;

// find the max element from array with element index
class Array10
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of array");
		int size = sc.nextInt();

		System.out.println("Enter element in Array ");
		int []arr = new int[size];

		// for get input

		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}

		// output
		int max = arr[0];
		int indx = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max){

				max = arr[i];
				indx = i;
			}
		}

		System.out.println("the max Element of An Array is : "+ max);
		System.out.println("the index of max element is : "+ indx);
	}
}