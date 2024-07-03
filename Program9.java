// run status : true

//02-07-2024


import java.util.Scanner;

class Program9
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        // step 1 : read num
	    int num = s.nextInt();
	    // step 2 : preserve original 
	    int original_num = num;
	    //step 3 : find m (length of num)

	    int count = 0;
	    while(num !=0 )
	    {
	    	num /=10;
	    	count++;
	    }
	    int m = count;
	    // step 4 calculate sum

	    num = original_num;
	    int sum = 0;

	    while(num !=0)
	    {
	    	int d = num %10;

	    	int power = 1;
	    	for(int i=1;i<=m;i++)
	    	{
	    		power = power*d;
	    	}//end of inner for loop

	    	sum = sum+power;
	    	//update num

	    	num /=10;
	    }// end of while loop

	   //System.out.println(sum);
	    // step 5 : compare sum with original num
	    if(original_num == sum)
	    	System.out.println("it is Special");
	    else
	    	System.out.println("it is not Special");
	    

	}//end main
}