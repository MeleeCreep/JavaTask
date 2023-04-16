import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = input.nextLine();
        System.out.println("Введите искомую подстроку:");
        String found = input.nextLine();

        int per = text.indexOf(found);
        if(per == -1)
        {
            System.out.printf("%1s", per);
        }
        System.out.printf("Индекс первого вхождения подстроки: %1s", per);
    }
}