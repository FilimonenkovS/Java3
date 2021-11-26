import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        Scanner xd = new Scanner(System.in);

        System.out.println("Введите значение");

        int a = xd.nextInt();
        int b = xd.nextInt();
        int c = xd.nextInt();
        int d = xd.nextInt();

        int min = b;

        if (min > a) {
            min = a;
            if (min > c) {
                min = c;
                if (min > d) {
                    min = d;
                }
            }
            if (min > d) {
                min = d;
            }
        } else if (min > c) {
            min = c;
            if (min > d) {
                min = d;
            }
        }
        else if (min > d)
        {
            min = d;
        }


        System.out.printf("Min is %d \n", min);
        xd.close()
    }


}