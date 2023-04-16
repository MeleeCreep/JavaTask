import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите строку: ");
                String str = input.nextLine();
                str = str.toLowerCase();
                String[] words = str.split("[(\\p{Punct}) (\\p{javaWhitespace})]");
                String res = Arrays.stream(words).sorted().collect(Collectors.joining(" "));
                System.out.println("\nСлова в алфавитном порядке: \n" + res + "\n");
            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}