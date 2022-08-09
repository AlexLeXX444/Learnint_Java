/*
(+) 1 Выбросить случайное целое число и сохранить в i
(+) 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
(+) 3 Найти все кратные n числа большие i и сохранить в массив m1
(+) 4 Найти все некратные n числа меньшие i и сохранить в массив m2
(+) 5 Сохранить оба массива в файлы с именами m1 и m2 соответственно.

(-)Пункты реализовать в методе main
(+)*Пункты реализовать в разных методах
(+)**Реализовать один из пунктов рекурсией
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        // Задаём переменную и присваеваем ей рандомное число от 0 до 99 включительно.
        int i = (int)(Math.random() * 100);
        int n = setBitNumber(i);
        ArrayList<Integer> m1 = multipleNums(i, n);
        ArrayList<Integer> m2 = notMultipleNums(i, n);
        createFile(m1, true);
        createFile(m2, false);
    }

    // Возводим двойку в степень N рекурсией.
    static int raiseTwo (int step) {
        if (step == 0) return 1;
        else return raiseTwo (step - 1) * 2;
    }

    // Находим номер старшего значащего бита выпавшего числа.
    static int setBitNumber(int num) {
        if (num == 0) return 0;
        int bitNum = 0, j = 1;
        while (bitNum < num) {
            bitNum = raiseTwo(j);
            j++;
        }
        return raiseTwo(j - 2);
    }

    // Находим числа кратные n в промежутке от i до 1000.
    static ArrayList<Integer> multipleNums (int starterRange, int num) {
        ArrayList<Integer> answerArray = new ArrayList<>();
        for (int k = starterRange; k < 1000; k++){
            if (k % num == 0) answerArray.add(k);
        }
        return answerArray;
    }

    // Находим числа в промежутке от 1 до i НЕ кратные n.
    static ArrayList<Integer> notMultipleNums (int enderRange, int num) {
        ArrayList<Integer> answerArray = new ArrayList<>();
        for (int k = 1; k < enderRange; k++){
            if (k % num != 0) answerArray.add(k);
        }
        return answerArray;
    }

    // Создаём файлы m1 и m2 и записываем в них полученные массивы.
    // Если такое файлы есь, то перезапишем их.
    static void createFile (ArrayList<Integer> a, boolean isMultiple){
        String fileName = "m1.txt";
        if (isMultiple == false) { fileName = "m2.txt"; }
        try(FileWriter writer = new FileWriter(fileName, false))
        {
            writer.write(a.toString());
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
 }