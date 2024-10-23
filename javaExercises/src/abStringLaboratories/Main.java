package stringLaboratories;

public class Main {
	public static void main(String args[]) {
		String phrase = "Java programming is fun and educational";
		boolean funInSentence = phrase.contains(phrase);
		System.out.println("Fun is in phrase: " + funInSentence);
		
		String wordReplaced = phrase.replace("educational", "awesome");
		System.out.println(wordReplaced);
		
		int originalLength = phrase.length();
		System.out.println("Length of phrase " + originalLength);
		
		String shortenedPhrase = phrase.substring(0, 17);
		System.out.println(shortenedPhrase);

		
	}
}
