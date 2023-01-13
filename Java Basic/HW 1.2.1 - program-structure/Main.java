import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Программа расчета суммы трех чисел");
    System.out.println("Введите первое число:");
    int inputValue1 = scanner.nextInt();      
    System.out.println("Введите второе число:");
    int inputValue2 = scanner.nextInt();      
    System.out.println("Введите третье число:");
    int inputValue3 = scanner.nextInt();      
    System.out.println("Сумма чисел = " + sum(inputValue1, inputValue2, inputValue3));
  }

  public static int sum(int value1, int value2, int value3) {

    return (value1 + value2 + value3);
  }
}