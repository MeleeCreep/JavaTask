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
                String[] words = str.split("");
                String res = Arrays.stream(words).distinct().collect(Collectors.joining());
                System.out.println("\nСтрока без повторяющихся символов: \n" + res + "\n");
            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}