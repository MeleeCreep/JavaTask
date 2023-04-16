import java.util.Scanner;

public class Main {
    public static String Palindrom(String a){
        String[] lineM = a.split(" ");
        int lineL = lineM.length -1;
        String result;
        for(int i=0; i < Math.floor(lineM.length / 2); i++){
            if(!(lineM[i].equals(lineM[lineL - i]))){
                result = "Строка НЕ является палиндромом!";
                return result;
            }
        }
        return a + (" - является палиндромом");
    }

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        String line = text.nextLine();
        text.close();
        String res = Palindrom(line);
        System.out.printf("%1s", res);
    }
}