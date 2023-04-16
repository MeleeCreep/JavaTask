import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите массив чисел: ");
        String nums = input.nextLine();
        String[] masNumsS = nums.split(" ");
        Double[] masNums = new Double[masNumsS.length];

        for(int i = 0; i < masNumsS.length; i++){
            masNums[i] = Double.parseDouble(masNumsS[i]);
        }

        int maxSum = 0;

        for(int i = 0; i < masNums.length; i++){
            int sumStart = 0;
            for(int j = i; j < masNums.length; j++){
                sumStart += masNums[j];
                maxSum = Math.max(maxSum, sumStart);
            }
        }
        System.out.printf("Максимальная сумма элементов - %1s",maxSum);
    }
}