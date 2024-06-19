// Run Status : true
//19-06-2024

// this is the program to determind the grade

import java.util.Scanner;


class GradeCalculator
{
    public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);

    		System.out.print("Enter A Score : ");
    		int score = sc.nextInt();

    		if(score>=90)
    		{
    			System.out.println(score + " The Grade is A");
    		}
    		else if(score>=80&&score<=89)
    		{
    			System.out.println(score +" The Grade is B");
    		}
    		else if(score>=70&&score<=79)
    		{
    			System.out.println(score +" The Grade is C");
    		}
    		else if(score>=60&&score<=69)
    		{
    			System.out.println(score +" The Grade is D");
    		}
    		else if(score<60)
    		{
    			System.out.println(score +" The Grade is F");
    		}
    		else{
    			System.out.println("invalid Score");
    		}
    	}	
}