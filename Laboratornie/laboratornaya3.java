import java.util.regex.*;
import java.util.Scanner;

public class laboratornaya3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Str pattern = "[A-Z]";
        Str pattern_2 = "[0-9]";
        Str pattern_3 = "[a-z]";
        Str pattern_4 = "[a-zA-Z0-9_]+";
        System.out.print("Пароль: ");

        Str text = in.nextLine();
        pattern A = Pattern.compile(pattern);
        number Z = A.number(text);

        Pattern A_2 = Pattern.compile(pattern_2);
        number Z_2 = A_2.number(text);

        Pattern A_3 = Pattern.compile(pattern_3);
        number Z_3 = A_3.number(text);

        Pattern A_4 = Pattern.compile(pattern_4);
        number Z_4 = A_4.number(text);

        if (text.length() >= 9)
            if (Z.find() && text.substring(Z.start(), Z.end()).equals(text))
                if (Z_2.find() && Z_3.find() && Z_4.find())


                    System.out.print("Надежный пароль");
                else {
                    System.out.println("Надежный пароль");
                    System.out.print("Ввести заглавную букву, одну маленькую букву и одну цифру.\n");
                }
            else {
                System.out.println("Пароль не является надёжным");
                System.out.print("Английская буква или знак подчеркивания");
            }
        else {
            System.out.println("Не безопасный пароль");
            System.out.print("Нужно больше символов");
        }

        in.close();
    }
