import java.util.Scanner;
import java.util.*;
// remaining
class StringAsc
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String");
		String name = input.next();
        int []arr = new int[name];
       for(int i=0;i<name.length();i++)
       {
           arr[i] =input.nextInt();
       }

       
        
    }
}