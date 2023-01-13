import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Введите длину участка в метрах:");
    int lenght = scanner.nextInt();
    System.out.println("Введите ширину участка в метрах:");
    int width = scanner.nextInt();

    int perimeter = calculatePerimeter(lenght, width);
    System.out.println("Периметр участка: " + perimeter + " см.");
    int area = calculateArea(lenght, width);
    System.out.println("Площадь участка: " + area + " см.кв.");
  }

   static int calculatePerimeter(int lenght, int width) {
     return (2 * (lenght + width));
   }

   static int calculateArea(int lenght, int width) {
     return (lenght * width);
   }
}