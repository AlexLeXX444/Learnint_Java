// (+) 1. Напишите программу, чтобы создать новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.
// (+) 2. Напишите программу для итерации всех элементов списка цветов и добавления к каждому символа '!'.
// (+) 3. Напишите программу для вставки элемента в список массивов в первой позиции.
// (+) 4. Напишите программу для извлечения элемента (по указанному индексу) из заданного списка.
// (+) 5. Напишите программу для обновления определенного элемента массива по заданному элементу.
// (+) 6. Напишите программу для удаления третьего элемента из списка массивов.
// (+) 7. Напишите программу для поиска элемента в списке массивов.
// (+) 8. Напишите программу для сортировки заданного списка массивов.
// (+) 9. Напишите программу для копирования одного списка массивов в другой.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();

        System.out.println("Задача 1: Напишите программу, чтобы создать новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.");
        FirstTask(myArrayList);
        System.out.println("\nЗадача 2: Напишите программу для итерации всех элементов списка цветов и добавления к каждому символа '!'.");
        SecondTask(myArrayList);
        System.out.println("\nЗадача 3: Напишите программу для вставки элемента в список массивов в первой позиции.");
        ThirdTask(myArrayList);
        System.out.println("\nЗадача 4: Напишите программу для извлечения элемента (по указанному индексу) из заданного списка.");
        FourthTask(myArrayList);
        System.out.println("\nЗадача 5: Напишите программу для обновления определенного элемента массива по заданному элементу.");
        FifthTask(myArrayList);
        System.out.println("\nЗадача 6: Напишите программу для удаления третьего элемента из списка массивов.");
        SixTask(myArrayList);
        System.out.println("\nЗадача 7: Напишите программу для поиска элемента в списке массивов.");
        SevenTask(myArrayList);
        System.out.println("\nЗадача 8: Напишите программу для сортировки заданного списка массивов.");
        EightTask(myArrayList);
        System.out.println("\nЗадача 9: Напишите программу для копирования одного списка массивов в другой.");
        NineTask(myArrayList);
        System.out.println("\nСпасибо за внимание!");

    }

    // первая задача.
    static void FirstTask (ArrayList<String> myArray) {
        for (int i = 0; i < 10; i++) {
            String textColor = TextColors.ConsoleColors((int)(Math.random() * 10));
            myArray.add(i, textColor + TextColors.ConsoleTextColors(textColor) + "\u001B[0m");
        }
        System.out.println(myArray);
    }

    // вторая задача.
    static void SecondTask (ArrayList<String> myArray) {
        for (int i = 0; i < 10; i++) {
            StringBuilder strAddSymbol = new StringBuilder(myArray.get(i));
            strAddSymbol.insert(strAddSymbol.length() - 4, '!');
            myArray.set(i, strAddSymbol.toString());
        }
        System.out.println(myArray);
    }

    // третья задача.
    static void ThirdTask (ArrayList<String> myArray) {
        String textRainbow = "\u001B[36mр\u001B[31mа\u001B[32mд\u001B[33mу\u001B[34mг\u001B[35mа\u001B[0m!";
        myArray.add(0, textRainbow);
        System.out.println(myArray);
    }

    // четвертая задача.
    static void FourthTask (ArrayList<String> myArray) {
        int index = (int)(Math.random() * 10);
        System.out.println("Под индексом элемента " + index + " стоит " + myArray.get(index) + "\b цвет.");
    }

    // пятая задача.
    static void FifthTask (ArrayList<String> myArray) {
        int index = (int)(Math.random() * 10);
        myArray.set(index, "\u001B[36mр\u001B[31mа\u001B[32mд\u001B[33mу\u001B[34mг\u001B[35mа\u001B[0m!");
        System.out.println(myArray);
    }

    //шестая задача.
    static void SixTask (ArrayList<String> myArray) {
        myArray.remove(3);
        System.out.println(myArray);
    }

    // седьмая задача.
    static void SevenTask (ArrayList<String> myArray) {
        String str = "стандартный!\u001B[0m";
        System.out.println("Ищем: " + str);
        int counter = 0;
        for (int i = 0; i < myArray.size(); i++) {
            String lookingStr = myArray.get(i);
            if (lookingStr.equals (str)) {
                System.out.print("Нашли под индексом: " + i + "\t");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.print("Не найдено.");
        }
        System.out.println();
    }


    // восьмая задача.
    static void EightTask (ArrayList<String> myArray) {
        myArray.sort(null);
        System.out.println(myArray);
    }

    // девятая задача.
    static  void NineTask (ArrayList<String> myArray) {
        ArrayList<String> copyArray = (ArrayList<String>) myArray.clone();
        myArray.clear();
        System.out.println("Старый список: " + myArray);
        System.out.println("Новый список: " + copyArray);
    }
}