import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";
    String output = "";

    //Цикл будет работать, пока пользователь не введет `end`
    while (true) {       
        System.out.println("Введите ASCII код (end для вывода результата):");
        input = scanner.nextLine();
        if ("end".equals(input)) {
            break;
        }
        int tmp = Integer.parseInt(input,8);
        char c = (char) tmp;
        output = output + c;
    }
    System.out.println(output);
  }
}