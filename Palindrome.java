/*
Write a program to find the reverse of a given number 
and check whether the given number is palindrome or not.

Description:

A palindrome is a word, sentence, verse, or even number 
that reads the same backward or forward.

Input : 12321
Reverse of the given number: 12321
The input and reverse number are same so it's called Palindrome

Test Case 1: 
	Input : 8767 
	Output : false

Test Case 2: 
	Input : 985589
	Output : true

Test Case 3: 
	Input : 65298
	Output : false
*/

import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num =sc.nextInt();
		int temp = num;i
		int reverse = 0;
		while(num !=0)
		{
			int digit = num%10;
			reverse = reverse *10+digit;
			num = num/10;
		}

		System.out.println(reverse);
		//check palindrome

		if(temp==reverse)
			System.out.println("it is Palindrome");
		else
			System.out.println("it is not palindrome");

	}
}