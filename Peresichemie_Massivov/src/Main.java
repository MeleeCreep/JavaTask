import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы (через пробел) первого массива:");
        String fm = input.nextLine();
        String[] fmsplit = fm.split(" ");
        System.out.println("Введите элементы (через пробел) второго массива:");
        String sm = input.nextLine();
        String[] smsplit = sm.split(" ");
        ArrayList<String> sameElem = new ArrayList<>();
        for(int i = 0; i < fmsplit.length; i++){
            for(int j = 0; j <smsplit.length; j++){
                if(fmsplit[i].equals(smsplit[j])){
                    sameElem.add(fmsplit[i]);
                    smsplit[j] = "";
                    break;
                }
            }
        }
        System.out.printf("%1s", sameElem);
    }
}
