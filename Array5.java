// run status  : true

import java.util.Scanner;

class Array5
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size = sc.nextInt();

		System.out.println("Enter Element in the array");
		int []arr = new int[size];

		//input 
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//finding element index form array
        System.out.println("Enter element your want print index");
        int f = sc.nextInt();
		//output
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==f)
			{
				System.out.println(f + " is present at index : "+ i);
			}
		}
	}
}