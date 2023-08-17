package finding_maximum_word;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {
		System.out.print("Введите строку: ");
		String user = scanner.nextLine();
		String[] words = user.split(" ");
		
		
		
		System.out.println("Самое длинное слово: " + longestWord(words));
		
	}
	public static String longestWord(String[] words) {
		String longestWord = words[0];
		for (String word : words) {

			
			
			if (longestWord.length() < word.length())
				longestWord = word;

			
		}
		return longestWord;

	}
}
