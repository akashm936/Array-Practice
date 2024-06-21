// run status : false
//19-06-2024

// this from is used for find the prime number the array

// remaining
class ArrayPrimeNumber
{
	public static void main(String[] args) {
		
		int [] arr = {2,3,4,7,13,14,15,16,17};
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
				for(int j=0;j<=arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(arr[i]+"");
				}
		}

		}

	}

// class ArrayPrime
// {



// 	public static void main(String[] args) {
// 		{
// 			int []a = { 1,2,3,4,,5,6,7,8,9,10};
// 			for(int i=0;i<a.length;i++)
// 			{
// 				boolean flag = true;
// 				if(a[i]==1)
// 				{
// 					flag=false;
// 				}

// 				for(int j=2;j<a[i];j++)
// 				{
// 					if(a[i]%j==0)
// 					{
// 						flag=false;
// 						break;
// 					}
// 				}
// 				if(flag)
// 				{
// 					System.out.println("prime number : "+a[i]);
// 				}
// 				else{
// 					System.out.println("Not a Prime Number : "+ a[i]);
// 				}
// 			}
// 		}
// 	}
// }