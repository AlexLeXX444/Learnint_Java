// Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder str_one = new StringBuilder(userEntries(1));
        StringBuilder str_two = new StringBuilder(userEntries(2));

        if (str_one.toString().equals(str_two.reverse().toString()))
            System.out.println("ДА");
        else
            System.out.println("НЕТ");
    }

    // Ввод от пользователя.
    static String userEntries (int str_num) {
        String answer_str = "";

        while (answer_str.length() == 0) {
            System.out.println(String.format("Введите текст строки %s: ", str_num));
            Scanner console = new Scanner(System.in);
            answer_str = console.nextLine ();
        }

        return answer_str;
    }
}