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
