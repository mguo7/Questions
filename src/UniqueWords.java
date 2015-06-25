import java.util.HashMap;
/*
 * Given a string print the unique words of the string.
 */
public class UniqueWords {

	public static void main(String[] args) {

		System.out.println("The original String is:");
		String words = "Find unique words in the string which the string contains duplicate words";
		System.out.println(words);
		System.out.println();
		HashMap<String, Integer> wordmap = new HashMap<String, Integer>();

		String[] wordlist = words.toLowerCase().split("\\s+");
		for (String word : wordlist) {

			if (!wordmap.containsKey(word)) {
				wordmap.put(word, 1);
			} else {

				wordmap.put(word, wordmap.get(word) + 1);
			}
		}

		System.out.println("The unique words are: ");
		for (String word : wordmap.keySet()) {
			if (wordmap.get(word).equals(1)) {
				System.out.println(word);
			}
		}

	}

}
