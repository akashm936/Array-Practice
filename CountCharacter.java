// run status : true
// 18-06-2024

// this program is used to count the repeated character in the given String

import java.util.Scanner;

class CountCharacter
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.nextLine();

		System.out.print("Enter a character to get count : ");
		char ch =sc.next().charAt(0);

		int count = 0 ;
		for(int i=0;i<name.length();i++)
		{
			char ch2 = name.charAt(i);
			if(ch == ch2)
			{
				count++;
			}
		}
		System.out.println("Count of "+ ch+" is "+ count);
	}
}