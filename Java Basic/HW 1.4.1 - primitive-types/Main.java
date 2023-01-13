import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть\n");

        Scanner scanner = new Scanner(System.in);
        int inputOperation = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите первое число:");
        double inputVal1 = Double.parseDouble(scanner.nextLine());

        float inputVal2 = 0;
        if (inputOperation == 1) {
            System.out.println("Введите второе число:");
            inputVal2 = Float.parseFloat(scanner.nextLine());
        }

        System.out.println("Результат:");

        switch (inputOperation) {
            case 1: {
                if (inputVal1 > inputVal2) {
                    System.out.println("Число 1 больше числа 2");
                } else if (inputVal1 < inputVal2) {
                    System.out.println("Число 2 больше числа 1");
                } else {
                    System.out.println("Числа равны");
                }
                break;
            }
            case 2: {
                System.out.println(Math.round(inputVal1));
                break;
            }
            case 3: {
                System.out.println((long) inputVal1);
                break;
            }
        }
    }
}


