
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner input= new Scanner(System.in);
        System.out.println("Введите число");
        n = input.nextInt();

        if ((n>=0)&&(n<15)) {
            for (int i = 1; i <=n; i++) {
                fact= fact*i;
            }//for
            System.out.println("Factorial of"+n+"is "+fact);

        }
        else {
         System.out.println("Ошибка");
        }

    }
}