// **Сравнить время выполнения пункати 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Замена средствами String: " + replaceStringReplace(fillString()));
        System.out.println("Замена средствами StringBuilder: " + replaceStringBuilder(fillString()));
    }

    // Заполнение строки.
    static String fillString () {
        StringBuilder answer = new StringBuilder("");
        for (int i = 1; i <= 10000; i++) {
            answer.append("=");
        }
        return answer.toString();
    }

    // Замена средствами String.replace.
    static long replaceStringReplace (String str) {
        Instant start = Instant.now();
        String new_str = str.replace("=", "равно");
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }

    // Замена средствами StringBuilder.
    static long replaceStringBuilder (String str) {
        Instant start = Instant.now();
        StringBuilder new_str = new StringBuilder(str);
        for (int i = 0; i < new_str.length(); i++) {
            if (new_str.charAt(i) == '=') {
                new_str.replace(i, i + 1, "равно");
            }
        }
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }
}