import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите новое дело (end - для конца):");
            String value = scanner.nextLine();
            if ("end".equals(value)) {
                break;
            }
            TodoList.listAdd(value);
        }
        TodoList.listPrint();
        System.out.println();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            String value = scanner.nextLine();
            if ("1".equals(value)) {
                System.out.println("[1] Введите новое дело:");
                value = scanner.nextLine();
                TodoList.listAdd(value);
            } else if ("2".equals(value)) {
                TodoList.listPrint();
            } else if ("3".equals(value)) {
                System.out.println("[3] Введите номер задачи для удаления:");
                int index = Integer.parseInt(scanner.nextLine());
                index--;
                TodoList.listDelete(index);
            } else if ("0".equals(value)) {
                System.out.println("[4] Выход из программы");
                break;
            }
        }
    }
}
