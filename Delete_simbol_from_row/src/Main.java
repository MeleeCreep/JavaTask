import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создайте программу, которая удаляет заданный символ из строки. 
        //Результат выводится в консоль. Входные данные - строка с произвольным количеством символов и символ, который нужно удалить. 
        //Выходные данные - строка, очищенная от заданного символа.
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
