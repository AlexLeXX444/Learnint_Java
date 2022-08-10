// Дано два числа, например 3 и 56, необходимо составить следующие строки:
// 3 + 56 = 59
// 3 – 56 = -53
// 3 * 56 = 168
// Используем метод StringBuilder.append().

// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().

// *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num_a = userEntries(1);
        int num_b = userEntries(1);

        outputPrimer(num_a, num_b);
        System.out.println();
        outputPrimerReplaced(num_a, num_b);
        System.out.println();
        outputPrimerReplace(num_a, num_b);
    }

    // Основной вывод по задаче.
    static void outputPrimer(int a, int b) {
        StringBuilder main_str = new StringBuilder("");

        System.out.println(main_str.append(a + " + " + b + " = " + (a + b)));
        main_str.setLength(0);
        System.out.println(main_str.append(a + " - " + b + " = " + (a - b)));
        main_str.setLength(0);
        System.out.println(main_str.append(a + " * " + b + " = " + (a * b)));
        main_str.setLength(0);
    }

    // Вывод с заменой знака = на слово равно.
    static void outputPrimerReplaced(int a, int b) {
        StringBuilder summ_str = new StringBuilder(" +  = ");
        StringBuilder razn_str = new StringBuilder(" -  = ");
        StringBuilder mult_str = new StringBuilder(" *  = ");

        summ_str.deleteCharAt(4).insert(4, "равно");
        summ_str.append(a + b);
        summ_str.insert(3, b);
        summ_str.insert(0, a);
        System.out.println(summ_str);
        razn_str.deleteCharAt(4).insert(4, "равно");
        razn_str.append(a - b);
        razn_str.insert(3, b);
        razn_str.insert(0, a);
        System.out.println(razn_str);
        mult_str.deleteCharAt(4).insert(4, "равно");
        mult_str.append(a * b);
        mult_str.insert(3, b);
        mult_str.insert(0, a);
        System.out.println(mult_str);
    }

    // Вывод с заменой знака = на слово равно используя replace().
    static void outputPrimerReplace(int a, int b) {
        StringBuilder summ_str = new StringBuilder(" +  = ");
        StringBuilder razn_str = new StringBuilder(" -  = ");
        StringBuilder mult_str = new StringBuilder(" *  = ");

        summ_str.replace(4, 5, "равно");
        summ_str.append(a + b);
        summ_str.insert(3, b);
        summ_str.insert(0, a);
        System.out.println(summ_str);
        razn_str.replace(4, 5, "равно");
        razn_str.append(a - b);
        razn_str.insert(3, b);
        razn_str.insert(0, a);
        System.out.println(razn_str);
        mult_str.replace(4, 5, "равно");
        mult_str.append(a * b);
        mult_str.insert(3, b);
        mult_str.insert(0, a);
        System.out.println(mult_str);
    }

    // Ввод пользователя.
    public static int userEntries(int numberOfStr) {
        String inputStr = "";

        while (inputStr.length() == 0) {
            System.out.println(String.format("Введите текст строки %s: ", numberOfStr));
            Scanner console = new Scanner(System.in);
            inputStr = console.nextLine ();
        }

        return Integer.parseInt(inputStr);
    }
}