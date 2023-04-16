import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создайте программу, которая определяет, сколько раз встречается слово в заданной строке. Результат выводится в консоль. 
        //Входные данные - строка с произвольным количеством слов и искомое слово. Выходные данные - число, обозначающее, сколько раз встречается искомое слово в строке.
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите строку: ");
                String str = input.nextLine();
                System.out.printf("Введите слово: ");
                String word = input.nextLine();
                String s = word.replaceAll("[(\\p{Punct}) (\\p{javaWhitespace})]", "").toLowerCase();
                str = str.toLowerCase();
                String[] words = str.split("[(\\p{Punct}) (\\p{javaWhitespace})]");
                int res = (int) Arrays.stream(words).filter(n -> n.equals(s)).count();
                System.out.println("\nКоличество повторений слова " + s + ": " + res + "\n");
            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}
