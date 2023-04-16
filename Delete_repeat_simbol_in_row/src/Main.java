import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Создайте программу, которая из введенной строки убирает повторяющиеся символы. Результат выводится в консоль. 
        //Входные данные - строка с произвольным количеством символов. Выходные данные - измененная строка с уникальными символами.
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
