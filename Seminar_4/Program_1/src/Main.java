/*
семинар 4
(+) 1. Объявить и инициализировать связанный список в 10000 элементов случайным числом от -1024 до 1024
(+) 2. Пройти по списку и удалить все отрицательные элементы
(+) 3. Скопировать в переменные и удалить из списка первый и второй элементы, сложить переменные, результат сохранить в начало списка.
(+) 4. Реализовать пункт №3 для всего списка.
(+) 5. Измерить время исполнения пунктов №2 и №3.
(+) 6. *Реализовать пункты с первого по пятый но с ArrayList. Сравнить время исполнения.
() 7. **Оптимизировать реализацию заданий так, чтобы время выполнения LinkedList и ArrayList были наименьшим.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            int x = new Random().nextInt(1025);
            boolean y = new Random().nextBoolean();
            if (y) {
                newLinkedList.add(x);
            } else {
                newLinkedList.add(x * (-1));
            }
        }

        System.out.println("LinkedList: ");
        System.out.print("Task 2 ::: \t");
        LinkedListTimers.TaskTwo(newLinkedList);
        System.out.print("Task 3 ::: \t");
        LinkedListTimers.TaskThree(newLinkedList);
        System.out.print("Task 4 ::: \t");
        LinkedListTimers.TaskFour(newLinkedList);
        System.out.println();

        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            int x = new Random().nextInt(1025);
            boolean y = new Random().nextBoolean();
            if (y) {
                newArrayList.add(x);
            } else {
                newArrayList.add(x * (-1));
            }
        }

        System.out.println("ArrayList: ");
        System.out.print("Task 2 ::: \t");
        ArrayListTimers.TaskTwo(newArrayList);
        System.out.print("Task 3 ::: \t");
        ArrayListTimers.TaskThree(newArrayList);
        System.out.print("Task 4 ::: \t");
        ArrayListTimers.TaskFour(newArrayList);

    }
}