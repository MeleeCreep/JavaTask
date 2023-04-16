import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создайте программу, которая находит наиболее встречающееся слово в заданной строке. 
        //Результат выводится в консоль. Входные данные - строка с произвольным количеством слов. 
        //Выходные данные - слово, которое встречается чаще всех в строке.
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите строку: ");
                String str = input.nextLine();
                str = str.toLowerCase();
                String[] words = str.split("[(\\p{Punct}) (\\p{javaWhitespace})]");
                Map<String, Integer> prom = new HashMap<String, Integer>();
                for (String word: words) {
                    prom.put(word, prom.getOrDefault(word, 0) + 1);
                }
                int max = 0;
                for (String el: prom.keySet()){
                    if(prom.get(el.toString()) > max)
                        max = prom.get(el);
                }
                System.out.println("В предлодении чаже всего встречается слово(ва):" );
                for (String el: prom.keySet()){
                    int res = prom.get(el.toString());
                    if(res == max) {
                        System.out.printf("%1s: %2s раз(а)\n", el, res);
                    }
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("\nНеверный формат!\n");
            }
        }
    }
}
