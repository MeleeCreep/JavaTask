import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);
        System.out.println("Введите первый член арифметической прогрессии:");
        int a = inpunt.nextInt();
        System.out.println("Введите разность прогрессии:");
        int d = inpunt.nextInt();
        System.out.println("Введите номер члена:");
        int n = inpunt.nextInt();
        int an = a + d * (n - 1);
        System.out.printf("%1s-й член данного ряда - %2s",n, an);
    }
}