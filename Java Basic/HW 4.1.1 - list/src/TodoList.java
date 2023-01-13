import java.util.ArrayList;

public class TodoList {
    private final static ArrayList<String> todoList = new ArrayList<>();

    public static void listAdd(String task) {
        todoList.add(task);
        System.out.println("Задача '" + task + "' добавлена.");
    }

    public static void listDelete(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            System.out.println("Задача #" + (index + 1) + " удалена.");
        } else {
            System.out.println("Не верный номер задачи для удаления.");
        }
    }

    public static void listPrint() {
        if (todoList.size() > 0) {
            System.out.println("Список задач:");
            for (int i = 0; i < todoList.size(); i++) {
                String value = todoList.get(i);
                System.out.println(i + 1 + " - " + value);
            }
        } else {
            System.out.println("Нет задач для вывода.");
        }
    }
}
