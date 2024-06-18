// run status : false
// 18-06-2024

// remaining

class StringEmptyExample
{
	public static void main(String[] args) {
		
		String kartikgf = " ";
		String kartikwife = "Komal";

		if(kartikgf.isEmpty())
		{
			try
			{
				throw new Exception ( "kartik does not have GF ");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if(kartikwife.isEmpty())
				{
					System.out.println("kartik does not have wife");
				}
				else{
					System.out.println("kartik wife is : "+kartikwife);
				}
			}
		}
	}
}
class kartikgirlFriendException extends StringEmptyExample
{
	String message;
	kartikgirlFriendException(String message)
	{
		super(message);
	}
}