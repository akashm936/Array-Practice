// run Status  : true
// 18-06-2024


// this program is used to count the character repeat multiple times in the String
class StringCountExample
{

	public static void main(String[] args) {
		String name1 = "Akash";
		String name2 = "Ramesh";
		String name3 = "Mahesh";
		String name4 = "";

		String convertedCaps = name1.toUpperCase();
		System.out.println(convertedCaps);

		int length = name3.length();

		System.out.println(length);

		char singleCharacter = name1.charAt(2);
		System.out.println(singleCharacter);

		String mergedNames = name1.concat(" "+name2);
		System.out.println(mergedNames);

		String multipleChars = name2.substring(0,2);
		System.out.println(singleCharacter);
	
        boolean emptyOrNot = name4.isEmpty();
        System.out.println(emptyOrNot);
	}


}