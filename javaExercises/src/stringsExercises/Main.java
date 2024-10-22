package stringsExercises;

public class Main {
	public static void main(String args[]) {
		 String fruit = "Banana";

		// 1. length(). This will be 6 because "Banana" has 6 letters
			int length = fruit.length();
			// System.out.println("The length of the String:" + fruit + " is : " + length + " letters.");
	
		// 2. charAt(index): This will be 'a', because 'B' is at index 0 and 'a' is at index 1
			char letter = fruit.charAt(1);
			// System.out.println("The character at index 1 is: " + letter);
		
		// 3. substring(start, end). This will be "ana"
			String partFrom1To4 = fruit.substring(1, 4);
			String partFrom4To5 = fruit.substring(4, 6);
		
			/*
			System.out.println("The full string is: " + fruit);
			System.out.println("The substring from index 1 to 4. 4 excluded: " + partFrom1To4);
			System.out.println("The substring from index 4 to 5. 5 excluded: " + partFrom4To5);
			*/
		
		// 4. equals(anotherString).
			// B is capital
			String fruit1 = "Banana";
			
			// b is smaall
			String fruit2 = "banana";
			
			// B is capital 
			String fruit3 = "Banana";
			
			// will be false since the case don't match
			boolean result1 = fruit1.equals(fruit2);
			
			// will be true since the case matches
			boolean result2 = fruit1.equals(fruit3);
			
			/*System.out.println("Using equals() method \"" + fruit1 + "\" is equal to \"" + fruit2 + "\": " + result1);
			System.out.println("Using equals() method \"" + fruit1 + "\" is equal to \"" + fruit3 + "\": " + result2);*/
			
		// 5. toLowerCase() and toUpperCase()
			// B is capital
	        String fruitInUpperCase = fruit.toUpperCase();
	        String fruitInLowerCase = fruit.toLowerCase();

	        /*System.out.println("The fruit: \"" + fruit + "\"");
	        System.out.println("The fruit converted to uppercase: \"" + fruitInUpperCase + "\"");
	        System.out.println("The fruit converted to lowercase: \"" + fruitInLowerCase + "\"");*/
			
	   // 6. contains(sequence)
	        boolean hasAna = fruit.contains("ana");
	        boolean hasBrooks = fruit.contains("brooks");

	        /*System.out.println("The fruit: \"" + fruit + "\"");
	        System.out.println("The fruit \"" + fruit + "\" contains the substring \"ana\": " + hasAna);
	        System.out.println("The fruit \"" + fruit + "\" contains the substring \"brooks\": " + hasBrooks);*/
	       
	   // 7. replace(oldChar, newChar)
	        
	        String fruitWithLetter_A_replaceWidth_O = fruit.replace('a', 'o');
	        
	        /*System.out.println("The fruit: \"" + fruit + "\"");
	        System.out.println("The fruit: \"" + fruit + "\" width character \"a\" replaced width character \"o\": " + fruitWithLetter_A_replaceWidth_O);*/
	   
	   // 8. Ejercicios  
	        String text = "Adventure";

	        // TODO: Check the length using length() and print the length
	        int printText = text.length();
	        System.out.println("The length of adventure is: " + printText);

	        // TODO: Get the character at position 3 and print the character      
	        char positionLetter = text.charAt(3);
	        System.out.println("The character at positions 3 is: " +positionLetter);

	        // TODO: Get a part of the String from position 1 to 4 and print the string
	        String positionsLetter = text.substring(1, 4);
	        System.out.println("The substring from position 1 to 4 is: " + positionsLetter);

	        String anotherText= "Adventure";

	        // TODO: Compare text with anotherText using equals() and print the output
	        boolean result = text.equals(anotherText);
	        System.out.println("Comparing Strings: " + result);

	        // TODO: Change to uppercase using toUpperCase() and print the converted string
	        String textToUppercase = text.toUpperCase();
	        System.out.println("The text to Uppercase: " + textToUppercase);

	        // TODO: Change to lowercase using toLowerCase() and print the converted string
	        String textToLowercase = textToUppercase.toLowerCase();
	        System.out.println("The text to Lowercase: " + textToLowercase);

	        // TODO: Check if it contains "vent" using contains() and print the output
	        boolean hasVent = text.contains("vent");
	        System.out.println("Is there a substring like vent in \" "+ text +" \": " + hasVent);

	        // TODO: Replace 'e' with 'a' and print the output
	        String text_E_replace_A = anotherText.replace('e', 'a');
	        System.out.println("Character replaced: "+text_E_replace_A);

	}
}
