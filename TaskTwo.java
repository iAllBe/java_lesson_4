import java.util.LinkedList;
import java.util.Scanner;

public class TaskTwo {
    // 2. Реализуйте очередь с помощью LinkedList со следующими методами: enqueue()
    // - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
    // очереди и удаляет его, first() - возвращает первый элемент из очереди, не
    // удаляя.

    LinkedList<String> list = new LinkedList<>();
    String string, temp;

    public void work() {
        do {
            System.out.println("Список: " + list);

            Scanner in = new Scanner(System.in);
            string = in.next();

            if (string.equals("enqueue")) {
                enqueue();
            } else if (string.equals("dequeue")) {
                dequeue();
            } else if (string.equals("first")) {
                first();
            }

        } while (!string.equals("Q"));
        System.out.println("Выход");
    }

    public void enqueue() {
        Scanner scan = new Scanner(System.in);
        temp = scan.next();
        list.add(temp);
    }

    public void dequeue() {
        System.out.println("Этот элемент удален: " + list.get(0));
        list.remove(0);
    }

    public void first() {
        System.out.println("Первый элемент: " + list.get(0));
    }
}
