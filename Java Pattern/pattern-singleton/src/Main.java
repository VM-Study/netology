import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запуск программы");
        logger.log("Ввод значений");
        System.out.println("Введите размер списка:");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int m = scanner.nextInt();
        logger.log("Создание списка");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        System.out.print("Вот случайный список: ");
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("Введите порог для фильтра:");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> filterList = filter.filterOut(list);
        System.out.print("Отфильтрованный список: ");
        System.out.println(Arrays.toString(filterList.toArray()));

        logger.log("Завершение программы");
    }
}