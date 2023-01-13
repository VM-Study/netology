import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0):");
            int value = scanner.nextInt();
            if (value == 0) {
                Elevator.floorAdd(value);
                System.out.println("Конец ввода команд лифта.");
                break;
            } else if (value < 0 || value > 25) {
                System.out.println("Такого этажа нет в доме.");
                continue;
            } else if (Elevator.isLastFloorSame(value)) {
                System.out.println("Этаж тот же самый.");
                continue;
            }
            Elevator.floorAdd(value);
        }
        Elevator.floorList();
        System.out.println();
    }
}
