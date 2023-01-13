import java.util.Scanner;

class Main {
  static final double PI = 3.14;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите радиус окружности в сантиметрах:");
    int radius = scanner.nextInt();
    
    double area = calculateCircleArea(radius);
    System.out.println("Площадь круга: " + area + " см.кв.");

    double lenght = calculateCircleLength(radius);
    System.out.println("Длина окружности: " + lenght + " см.кв.");
  }

  public static double calculateCircleArea(int radius) {
    return (PI * radius * radius);
  }

  public static double calculateCircleLength(int radius) {
    return (2 * PI * radius);
  }
}