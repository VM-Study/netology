import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();
        //input = "7 − 2 * 3";

        Stack<String> sign = new Stack<>();
        Queue<Integer> numbers = new ArrayDeque<>();

        String[] arrayValues = input.split(" ");

        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (value.chars().allMatch(Character::isDigit)) {
                numbers.add(Integer.parseInt(value));
            } else {
                sign.add(value);
            }
        }

        System.out.println("Выражение в формате обратной польской записи:");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pop() + " ");
        }

    }
}
