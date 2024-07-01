import java.util.Arrays;

class CommandLineArgument
{
	public static void main(String[] args) {
		
		// int num1 = Integer.parseInt(args[0]);
		// int num2 = Integer.parseInt(args[1]);
		// int num2 = Integer.parseInt(args[2]);
		// int num2 = Integer.parseInt(args[3]);
		// int num2 = Integer.parseInt(args[4]);

		// int add = num1 + num2;

		// System.out.println("Addition is : "+add); 
		String name = args[0];
		//c+s+f
		//c+m;

        for(int i=name.length()-1;i<=0;i--)
        {
        	System.out.println(name.reverse());
        }
	}
}