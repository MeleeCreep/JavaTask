import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите первое слово: ");
                String word1 = input.nextLine();
                word1 = word1.split("[(\\p{Punct}) (\\p{javaWhitespace})]")[0] ;
                System.out.printf("Введите второе слово: ");
                String word2 = input.nextLine();
                word2 = word2.split("[(\\p{Punct}) (\\p{javaWhitespace})]")[0] ;

                boolean res = false;
                if (word1.equals(word2)) {
                    System.out.println("\nСлова " + word1 + " и " + word2 + " являются 1 словом\n");
                    continue;
                }
                else if (word1.length() != word2.length()) {
                    res = false;
                }
                else{
                    char[] w1 = word1.toCharArray();
                    char[] w2 = word2.toCharArray();
                    Arrays.sort(w1);
                    Arrays.sort(w2);
                    res = Arrays.equals(w1, w2);
                }

                System.out.println("\nСлова " + word1 + " и " + word2 + (res ? "": " не") + " являются анаграммой\n");

            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}