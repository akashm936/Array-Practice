// run status : true

import java.util.Scanner;

// find min element with index
class Array8
{
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter the Size of an Array ");
	  int size = sc.nextInt();

	  System.out.println("Enter an element in Array ");
	  int []arr = new int[size];

     // for getting input in form of a array
	  for(int i=0;i<size;i++)
	  {
	  	arr[i]=sc.nextInt();
	  }

	  int min = arr[0];
	  int indx = 0;

	  for(int i=0; i<arr.length;i++)
	  {
	  	if(arr[i]<min)
	  	{
	  		min = arr[i];
	  		indx = i;
	  	}
	  }
	  System.out.println("Minimum element is : "+ min);
	  System.out.println("index of min element is :"+ indx);
	}
}