import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = input.nextLine();
        System.out.println(text.toUpperCase(Locale.ROOT));
    }
}