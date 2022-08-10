// *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String main_str = userEntries();
        System.out.println(reverseString(main_str));
    }

    // Ввод от пользователя.
    static String userEntries () {
        String answer_str = "";

        while (answer_str.length() == 0) {
            System.out.println("Введите текст строки: ");
            Scanner console = new Scanner(System.in);
            answer_str = console.nextLine();
        }

        return answer_str;
    }

    static String reverseString (String str) {
        if(str.length() == 0)
            return " ";
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }

}