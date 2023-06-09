import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создайте программу, которая преобразует строку из последовательности слов, разделенных пробелами, в строку, где слова переставлены в обратном порядке. 
        //Результат выводится в консоль. Входные данные - строка с произвольным количеством слов. 
        //Выходные данные - строка, в которой расположены слова исходной строки в обратном порядке.
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите строку из последовательности слов, разделенных пробелами: ");
                String str = input.nextLine();
                String[] words = str.split(" ");
                String[] words_reverse = new String[words.length];
                String res;
                for(int i= words.length-1; i>=0; i--){
                    words_reverse[words.length-1-i] = words[i];
                }
                res = String.join(" ", words_reverse);
                System.out.println("\nСлова в обратном порядке: \n" + res + "\n");

            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}
