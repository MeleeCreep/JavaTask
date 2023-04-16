import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ряд чисел:");
        String row = input.nextLine();
        String[] rowS = row.split(" ");
        Double[] rownum = new Double[rowS.length];
        double af = 0;
        double gf = 1;
        for (int i = 0; i < rownum.length; i++) {
            rownum[i] = Double.parseDouble(rowS[i]);
            af += rownum[i];
            gf *= rownum[i];
        }
        af = af/rownum.length;
        gf = Math.pow(gf, 1./rownum.length);
        System.out.printf("Среднее арифметическое - %1.2f Среднее геометрическое - %2.2f", af, gf);
    }
}