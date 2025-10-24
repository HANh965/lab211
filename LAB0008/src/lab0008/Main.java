
package lab0008;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your content: ");
        String input = sc.nextLine();

        // Đếm số từ
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Đếm số chữ cái
        Map<Character, Integer> letterCount = new LinkedHashMap<>();
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(wordCount);
        System.out.println(letterCount);
    }
}
