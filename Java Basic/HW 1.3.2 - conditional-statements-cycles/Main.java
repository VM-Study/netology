import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int totalTime = 0;
    int biggestTime = 0;
    int smallestTime = Integer.MAX_VALUE;
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Введите название задачи");
        String tmp = scanner.nextLine();
        System.out.println("Сколько дней потребуется на выполнение?");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println("Сколько часов?");
        int hours = Integer.parseInt(scanner.nextLine());
        System.out.println("Сколько минут?");
        int minutes = Integer.parseInt(scanner.nextLine());        
        
        int currentTimeTask = convertToSeconds(days, hours, minutes);
        totalTime += currentTimeTask;
        if (currentTimeTask > biggestTime) {
            biggestTime = currentTimeTask;
        }
        if (currentTimeTask < smallestTime) {
            smallestTime = currentTimeTask;
        }
        System.out.println("Для завершения работы программы введите `end` для продолжения нажмите enter");
        String input = scanner.nextLine(); //что ввел пользователь
        if ("end".equals(input)) {
            break;
        }
    }
    System.out.println("Всего потребуется: " +  totalTime + " секунд");
    System.out.println("Самая продолжительная задача займет: " +  biggestTime + " секунд");
    System.out.println("Самая короткая задача займет: " +  smallestTime + " секунд");
  }

    public static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = days * 24 * 3600 + hours * 3600 + minutes * 60;    
        return seconds; 
    }
}