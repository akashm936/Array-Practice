// run status : true

import java.util.Scanner;

// find the min value form the an array

class Array7
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Size of Array");
	int size = sc.nextInt();

	System.out.println("Enter the Element of An Array :");
	int []arr = new int[size];


   // for input 
	for(int i=0;i<size;i++)
	{
		arr[i]= sc.nextInt();
	}
    
    // get min variable
	int min = arr[0];
    
    // used for loop to find min valu form array

    for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{   
			min = arr[i];
			
		}

	}
	System.out.println("minimum value of array : "+ min);
	
	}
}