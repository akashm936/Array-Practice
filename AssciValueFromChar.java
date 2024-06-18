// run Status : true
//18-06-2024

import java.util.Scanner;
import java.util.Arrays;


// this program is used to find the Assci value of given String every character
class AssciValueFromChar
{
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = sc.nextLine();

		for(int i=0;i<name.length();i++)
		{
			char name2 =name.charAt(i);
			int assciData = name2;
			System.out.println(name2+ " : "+assciData);
		} 
	}
}