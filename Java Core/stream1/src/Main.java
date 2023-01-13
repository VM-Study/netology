import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filterList = new ArrayList<>();
        for (Integer number : intList) {
            if (number > 0 && number % 2 == 0) {
                filterList.add(number);
            }
        }
        Collections.sort(filterList);
        System.out.println("Filter without Stream: " + filterList);
        System.out.println();

        System.out.print("Filter with Stream: ");
        intList.stream()
                .filter(s -> s > 0)
                .filter(s -> s % 2 == 0)
                .sorted()
                .forEach(s -> System.out.print(s + " "));



    }
}

