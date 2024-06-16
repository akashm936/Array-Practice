import java.util.Scanner;

class Array4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
        
        System.out.println("Enter a element in a array: ");
        int [] arr = new int[size];

        //input
        for(int i =0;i<size;i++)
        {
        	arr[i]= sc.nextInt();
        }
         
        System.out.println("element in an Array");
        
        //output
        for(int i=0;i<size;i++)
        {
        	System.out.print(arr[i]+ " ");
        }

	}
}