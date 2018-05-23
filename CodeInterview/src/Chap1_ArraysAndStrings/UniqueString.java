package Chap1_ArraysAndStrings;

import java.util.Hashtable;

/*
 * Implement an algorithm to determine if a string has all unique characters.  
 * What if you cannot use additional data structures?
 */

public class UniqueString {

	private Hashtable<Integer, Character> table;
	
	/**
	 * Constructor for UniqueString Object.
	 */
	public UniqueString() {
		table = new Hashtable<Integer, Character>();
	}
	
	/**
	 * 
	 */
	public boolean isUniqueString(String str) {
		
		char[] array = str.toCharArray();
		for(int i = 0; i < array.length; i++) {
			table.put(i, array[i]);
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
		
//		System.out.println(table.keySet());
//		System.out.println(table.values());
		
	}
	
}
