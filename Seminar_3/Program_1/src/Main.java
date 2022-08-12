// (+) 1. Напишите программу, чтобы создать новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.
// (+) 2. Напишите программу для итерации всех элементов списка цветов и добавления к каждому символа '!'.
// (+) 3. Напишите программу для вставки элемента в список массивов в первой позиции.
// (+) 4. Напишите программу для извлечения элемента (по указанному индексу) из заданного списка.
// () 5. Напишите программу для обновления определенного элемента массива по заданному элементу.
// () 6. Напишите программу для удаления третьего элемента из списка массивов.
// () 7. Напишите программу для поиска элемента в списке массивов.
// () 8. Напишите программу для сортировки заданного списка массивов.
// () 9. Напишите программу для копирования одного списка массивов в другой.

// (int)(Math.random() * 10)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // задаем коллекцию из 10 элементов - проще отображать и работать с небольшим объемом данных.
        ArrayList<String> myArrayList = new ArrayList<>();
        FirstTask(myArrayList);
        SecondTask(myArrayList);
        ThirdTask(myArrayList);
        FourthTask(myArrayList);
    }

    // первая задача.
    static ArrayList<String> FirstTask (ArrayList<String> myArray) {
        for (int i = 0; i < 10; i++) {
            String textColor = TextColors.ConsoleColors((int)(Math.random() * 10));
            myArray.add(i, textColor + TextColors.ConsoleTextColors(textColor) + "\u001B[0m");
        }
        System.out.println(myArray.toString());
        return myArray;

    }

    // вторая задача.
    static void SecondTask (ArrayList<String> myArray) {
        for (int i = 0; i < 10; i++) {
            StringBuilder strAddSymbol = new StringBuilder(myArray.get(i));
            strAddSymbol.insert(strAddSymbol.length() - 4, '!');
            myArray.set(i, strAddSymbol.toString());
        }
        System.out.println(myArray.toString());
    }

    // третья задача.
    static void ThirdTask (ArrayList<String> myArray) {
        String textRainbow = "\u001B[36mр\u001B[31mа\u001B[32mд\u001B[33mу\u001B[34mг\u001B[35mа\u001B[0m!";
        myArray.add(0, textRainbow);
        System.out.println(myArray.toString());
    }

    // четвертая задача.
    static void FourthTask (ArrayList<String> myArray) {
        int index = (int)(Math.random() * 10);
        System.out.println("Под индексом элемента " + index + " стоит " + myArray.get(index) + "\b цвет");
    }
}