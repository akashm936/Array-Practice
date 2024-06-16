// run status  : true

import java.util.Scanner;

class Array6
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int []arr = {2,5,7,9,4,6};

		System.out.println("Enter element to print an index :");
		int e = sc.nextInt();

		for(int i=0;i<arr.length;i++)
		{

			if(arr[i]==e)
			{
				System.out.println(e + " is present at index : "+ i);
			}

		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+ i  );
		}
	}
}