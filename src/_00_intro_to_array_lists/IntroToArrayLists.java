package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {

		// 1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList<String>();
		// Don't forget to import the ArrayList (java.util) class

		// 2. Add five Strings to your list
		strings.add("Mandy");
		strings.add("Sheldon");
		strings.add("Mary");
		strings.add("Missy");
		strings.add("Connie");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		// 4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 0) {
				String s = strings.get(i);
				System.out.println(s);
			}
		}
		System.out.println("\n");
		// 6. Print all the Strings in reverse order.
		for (int i = strings.size() - 1; i >= 0; i--) {
			String s = strings.get(i);
			System.out.println(s);
		}

		System.out.println("\n");

		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
