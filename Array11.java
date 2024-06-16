// run status : true

import java.util.Scanner;

// find the index of a perticular element
class Arrray11
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int arr[] = { 9,6,2,5,8,1};

		System.out.println("Enter to find :");
		int fe = sc.nextInt();

        boolean flag = true;

        outerloop:
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==fe)
			{
				System.out.println(fe + " is present in array at index : "+ i);
			}
		} 
	}
}