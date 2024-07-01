import java.util.Scanner;

class FindLargest
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2 :");
		int num2 = sc.nextInt();

		for(int i=0;i<=num1;i++)
		{
			for (int j=0;j<=num2;j--) {
				if(i==0&&j==0)
				{
					System.out.println(i+j);
				}
			}
		}


	}
}