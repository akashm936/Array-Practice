// run status : true
// 18-06-2024

// this program is used to remove the some specific Character from the String

import java.util.Scanner;

class StringMethodReplace
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");
		String s = sc.nextLine();

		System.out.println("Enter a Character to remove the Occurrence : ");

		String ch = sc.next();
		String replace = s.replace(ch,"");

		System.out.println("new Character replace : "+ replace);
	}
}