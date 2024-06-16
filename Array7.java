import java.util.Scanner;

class Array7
{

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
}