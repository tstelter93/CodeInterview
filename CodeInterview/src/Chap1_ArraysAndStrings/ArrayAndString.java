package Chap1_ArraysAndStrings;

public class ArrayAndString {

	public static void main(String[] args) {
		System.out.print("Array and Strings Main" +
	        "\n------------------------------------- \n");
		
		UniqueString test = new UniqueString();
		
		// This is unique
		test.isUniqueString("qwertyuioplkjhgfdsa");
		
		// This is not unique
		test.isUniqueString("qwwq");
	}

}
