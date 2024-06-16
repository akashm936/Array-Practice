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
		int []arr = new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

		
	}
}