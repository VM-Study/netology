import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Elevator {
    private final static Deque<Integer> deque = new ArrayDeque<>();

    public static void floorAdd(int floor) {
        deque.add(floor);
        System.out.println("Этаж " + floor + ": поехали.");
    }

    public static boolean isLastFloorSame(int floor) {
        if (deque.isEmpty()) {
            return false;
        }
        int lastFloor = deque.getLast();
        if (lastFloor == floor) {
            return true;
        }
        return false;
    }

    public static void floorList() {
        System.out.println("Лифт проследовал по следующим этажам:");
        int size = deque.size();
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;

        while (!deque.isEmpty()) {
            int floor = deque.poll();
            totalSeconds += waitDoorsInSeconds + totalSeconds;

            System.out.print("Этаж " + floor);
            if (!deque.isEmpty()) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
        System.out.println("Время затраченное лифтом на маршрут: " + totalSeconds + " сек.");
    }
}
