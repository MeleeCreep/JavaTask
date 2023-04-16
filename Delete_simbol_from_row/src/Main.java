import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите строку: ");
                String str = input.nextLine();
                System.out.printf("Введите символ: ");
                String symb = input.nextLine();
                while (symb.length() != 1) {
                    System.out.println("Нужно ввести ровно 1 символ!");
                    System.out.printf("Введите символ: ");
                    symb = input.nextLine();
                }
                String res = str.replaceAll(symb, "");
                System.out.println("\nИзменённая строка: \n" + res + "\n");

            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}