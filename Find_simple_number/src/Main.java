import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.printf("Введите нижнюю границу диапазона (включительно): ");
                int min = input.nextInt();
                while (min <= 0) {
                    System.out.printf("Нужно ввести число больше 0");
                    System.out.printf("\nВведите нижнюю границу диапазона (включительно): ");
                    min = input.nextInt();
                }
                System.out.printf("Введите верхнюю границу диапазона (включительно): ");
                int max = input.nextInt();
                while (max <= 1 || max < min) {
                    System.out.printf("Нужно ввести число больше заданного минимального числа (" + min + ") и больше 1");
                    System.out.printf("\nВведите верхнюю границу диапазона (включительно): ");
                    max = input.nextInt();
                }
                String result = "";
                if (min < 2) min = 2;

                boolean checker = true;
                for (int i = min; i <= max; i++) {
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            checker = false;
                            break;
                        }
                    }
                    if (checker) result +=i + "\n";
                    checker = true;
                }

                //Вывод
                if (result == "") result = "в заданном диапазоне нет простых чисел";
                System.out.printf("Простые числа:\n%1$s\n", result);
            }
            catch(Exception e){
                System.out.println("\nЧисло введено в неправильном формате!\n");
            }
        }
    }
}