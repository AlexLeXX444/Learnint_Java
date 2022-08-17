import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class LinkedListTimers {
    // Пройти по списку и удалить все отрицательные элементы
    static void TaskTwo (LinkedList<Integer> myList) {
        Instant start = Instant.now();
        for (int i = 0; i < myList.size(); i++) {
            int num = myList.get(i);
            if (num < 0) {
                myList.remove(i);
                i--;
            }
        }
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }

    // Скопировать в переменные и удалить из списка первый и второй элементы, сложить переменные, результат сохранить в начало списка.
    static void TaskThree (LinkedList<Integer> myList) {
        Instant start = Instant.now();
        int a = myList.getFirst();
        myList.removeFirst();
        int b = myList.getFirst();
        myList.removeFirst();
        myList.addFirst(a + b);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }

    // Реализовать пункт №3 для всего списка.
    static void TaskFour (LinkedList<Integer> myList) {
        Instant start = Instant.now();
        while (myList.size() > 1) {
            int a = myList.getFirst();
            myList.removeFirst();
            int b = myList.getFirst();
            myList.removeFirst();
            myList.addFirst(a + b);
        }
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
}
