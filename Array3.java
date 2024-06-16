// run status  :true

import java.util.*;

class Array3
{
	public static void main(String[] args) {
		// int []marks = new int[3];
		// marks[0]=13;
		// marks[1]=45;
		// marks[2]=67;

		// for(int i=0;i<3;i++)
		// {
		// 	System.out.println(marks[i]);
		// }
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int []arr1 = new int[size];
		// String []arr2 = new String[size];
		// float []arr3 = new float[size];
		// boolean []arr4 = new boolean[size];

		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+ " ");
			// System.out.println(arr2[i]);
			// System.out.println(arr3[i]);
			// System.out.println(arr4[i]);
		}

		
	}
}