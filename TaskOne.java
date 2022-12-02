import java.util.LinkedList;

public class TaskOne {
    // 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернет “перевернутый” список.

    public void listReverse() {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> reverseList = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Изначальный список: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }

        System.out.println("Измененный список: " + reverseList);
    }
}