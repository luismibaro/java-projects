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

	        System.out.println("The fruit: \"" + fruit + "\"");
	        System.out.println("The fruit converted to uppercase: \"" + fruitInUpperCase + "\"");
	        System.out.println("The fruit converted to lowercase: \"" + fruitInLowerCase + "\"");
			
	   // 6. contains(sequence)
	        boolean hasAna = fruit.contains("ana");
	        boolean hasBrooks = fruit.contains("brooks");

	        System.out.println("The fruit: \"" + fruit + "\"");
	        System.out.println("The fruit \"" + fruit + "\" contains the substring \"ana\": " + hasAna);
	        System.out.println("The fruit \"" + fruit + "\" contains the substring \"brooks\": " + hasBrooks);
	}
}
