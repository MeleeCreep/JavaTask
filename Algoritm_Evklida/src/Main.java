import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Алгори́тм Евкли́да — эффективный алгоритм для нахождения наибольшего общего делителя двух целых чисел.
        while (true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Введите первое число:");
                int fnum = input.nextInt();
                System.out.println("Введите второе число:");
                int snum = input.nextInt();
                int d = 0;
                int max = fnum;
                if(max < snum){
                    max = snum;
                }
                for(int i = 1; i <= max/2; i++){
                    if(fnum%i == 0 && snum%i == 0 && i > d){
                        d = i;
                    }
                }
                System.out.printf("Наибольший общий делитель чисел %1s и %2s - %3s", fnum, snum, d);
            }
            catch (Exception e){
                System.out.println("Введите корректные данные!");
            }
        }
    }
}