import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Введите год в формате \"yyyy\"");
    int year = (new Scanner(System.in)).nextInt();

    if (year % 400 == 0) {
        System.out.println("Количество дней 366");
    } else if (year % 100 == 0) {
        System.out.println("Количество дней 365");
    } else {
        if (year % 4 == 0) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }
  }
}