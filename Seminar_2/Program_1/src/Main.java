// Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String main_str = userEntries(1);
        String pattern_str = userEntries(2);

        System.out.print(findWindow(main_str, pattern_str));
    }

    // Ввод пользователя.
    public static String userEntries(int numberOfStr) {
        String inputStr = "";

        while (inputStr.length() == 0) {
            System.out.println(String.format("Введите текст строки %s: ", numberOfStr));
            Scanner console = new Scanner(System.in);
            inputStr = console.nextLine ();
        }

        return inputStr;
    }


    // Ищем вхождение минимальное окно.
    public static String findWindow (String main_str, String looking_str) {
        int start = 0,
            start_index = -1,
            min_len = Integer.MAX_VALUE,
            count = 0;
        int[] hash_pat = new int[256];
        int[] hash_str = new int[256];

        // Если строка паттерна для поиска больше основной строки.
        if (main_str.length() < looking_str.length())
            return "Невозможно рассчитать!";

        // Сохраняем вхождение символов шаблона.
        for (int i = 0; i < looking_str.length(); i++)
            hash_pat[looking_str.charAt(i)]++;

        // Начинаем обход количества символов в строке.
        for (int j = 0; j < main_str.length(); j++) {

            // Подсчитаем вхождение символа строки.
            hash_str[main_str.charAt(j)]++;

            // Если символ строки совпадает с символом шаблона, то увеличьте количество счетчика.
            if (hash_str[main_str.charAt(j)]
                    <= hash_pat[main_str.charAt(j)])
                count++;

            // Если все символы совпали.
            if (count == looking_str.length()) {

                // Пытаемся сократить окно.
                while (hash_str[main_str.charAt(start)]
                        > hash_pat[main_str.charAt(start)]
                        || hash_pat[main_str.charAt(start)]
                        == 0) {

                    if (hash_str[main_str.charAt(start)]
                            > hash_pat[main_str.charAt(start)])
                        hash_str[main_str.charAt(start)]--;
                    start++;
                }

                // Обновим значение размера окна.
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // Если нет вхождений.
        if (start_index == -1) {
            System.out.println("Не нашли вхождений! ");
            return "";
        }

        // Возвращаем подстроку, начинающуюся с start_index и длиной min_len.
        return "Нашли минимальное окно: " + main_str.substring(start_index, start_index + min_len);

    }
}