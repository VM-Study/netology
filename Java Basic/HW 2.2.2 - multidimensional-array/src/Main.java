import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIZE = 10;
    final static int EMPTY = 0;
    final static int SHIP = 1;
    final static int DEAD = 2;
    final static int MISS = 3;
    static int MAX_COUNT = 10;
    static int MAX_TURNS = 30;

    public static void main(String[] args) {
        int warField[][] = new int[SIZE][SIZE];
        System.out.println("Игра \"Морской бой\"");
        System.out.println("Заполнение кораблей...");
        warField = generateShips(warField);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBattleDesk(warField);
            System.out.println("Введите координаты (x:y) для атаки (осталось " + MAX_TURNS + "):");
            String input = scanner.nextLine();
            String[] parts = input.split(":");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            x--;
            y--;
            MAX_TURNS--;
            warField = checkFire(warField, x, y);

            if (MAX_COUNT < 1) {
                System.out.println("Победа! Поздравляем, вы подбили все вражеские корабли!");
                break;
            }
            if (MAX_TURNS < 1) {
                System.out.println("Ходы закончились. Игра завершена!");
                break;
            }
        }
    }

    public static int[][] checkFire(int[][] warField, int x, int y) {
        switch (warField[x][y]) {
            case 0: {
                System.out.println("Промах.");
                warField[x][y] = MISS;
                break;
            }
            case 1: {
                System.out.println("Корабль застрелен!");
                warField[x][y] = DEAD;
                MAX_COUNT--;
                break;
            }
            case 2: {
                System.out.println("Корабль уже был убит.");
                break;
            }
            case 3: {
                System.out.println("Уже сюда стреляли.");
                break;
            }
        }
        return warField;
    }

    public static int[][] generateShips(int[][] warField) {
        Random random = new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shipPlace2 = random.nextInt(SIZE);
            if (warField[shipPlace1][shipPlace2] == SHIP) {
                // повторная генерация положения для данного корабля
                i--;
            }
            warField[shipPlace1][shipPlace2] = SHIP;
        }
        return warField;
    }

    public static void printBattleDesk(int[][] warField) {
        // выводим массив на экран
        // Цикл по первой размерности выводит строки
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < SIZE; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(warField[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
