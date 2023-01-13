import java.util.Random;
import java.util.Scanner;

public class Main {
    static int SIZE = 8;

    public static int[][]fillRandome(int[][]colors){
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }
        return colors;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        colors = fillRandome(colors);

        printArray(colors);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите угол наклона 90/180/270:");
        int level = input.nextInt();
        System.out.println();
        int[][] rotatedColors = new int[SIZE][SIZE];

        int m = 0;
        int n = 0;
        switch (level) {
            case 90: {
                System.out.println("90 градусов:");
                for (int j = 0; j < SIZE; j++) {
                    for (int i = SIZE - 1; i >= 0; i--) {
                        rotatedColors[m][n] = colors[i][j];
                        n++;
                    }
                    m++;
                    n = 0;
                }
                break;
            }
            case 180: {
                System.out.println("180 градусов:");
                for (int i = SIZE - 1; i >= 0; i--) {
                    for (int j = SIZE - 1; j >= 0; j--) {
                        rotatedColors[m][n] = colors[i][j];
                        n++;
                    }
                    m++;
                    n = 0;
                }
                break;
            }
            case 270: {
                System.out.println("270 градусов:");
                for (int j = SIZE - 1; j >= 0; j--) {
                    for (int i = 0; i < SIZE; i++) {
                        rotatedColors[m][n] = colors[i][j];
                        n++;
                    }
                    m++;
                    n = 0;
                }
                break;
            }
        }
        printArray(rotatedColors);

    }
}
