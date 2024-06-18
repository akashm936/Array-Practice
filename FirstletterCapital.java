// run Status : true
//18-06-2024

import java.util.Scanner;
import java.util.Arrays;

// this program is used to make first letter capital in the user given String 
class FirstletterCapital
{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a name :");

		String name = sc.next().toLowerCase();
		String firstLetterCaps = name.substring(0,1).toUpperCase();


		String remainingLetter = name.substring(1,name.length());


		String merge = firstLetterCaps.concat(remainingLetter);

		System.out.println(merge);

	}
}