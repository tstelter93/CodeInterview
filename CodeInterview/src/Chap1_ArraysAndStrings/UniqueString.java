package Chap1_ArraysAndStrings;

import java.util.Hashtable;

/*
 * Implement an algorithm to determine if a string has all unique characters.  
 * What if you cannot use additional data structures?
 */

public class UniqueString {

	private Hashtable<Character, Integer> table;
	
	/**
	 * Constructor for UniqueString Object.
	 */
	public UniqueString() {
		table = new Hashtable<Character, Integer>();
	}
	
	/**
	 * Try using a bit vector instead
	 * https://stackoverflow.com/questions/9141830/explain-the-use-of-a-bit-vector-for-determining-if-all-characters-are-unique
	 */
	public boolean isUniqueString(String str) {
		
		char[] array = str.toCharArray();
		
		// This runs in n^2. Need to rewrite algorithm.
		
		for(int i = 0; i < array.length; i++) {
			table.put(array[i], 0);
		}
		
        for(int i = 0; i < table.size(); i++) {
        	for(int j = 0; j < table.size(); j++) {
        		// Is the best way to iterate?
        		// We need to check the values
        		// We should convert the chars into hash and check the hashes instead. If a hash equals, then string is not unique
        	}
        }
        
        System.out.println("String is unique.");
        return true;
		
	}
	
}
