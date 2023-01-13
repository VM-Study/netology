import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
        String text = "Serialization is the process of converting an object into a stream of bytes That object can then be saved to a database or transferred over a network The opposite operation extracting an object from a series of bytes is deserialization Their main purpose is to save the state of an object so that we can recreate it when needed In this tutorial well explore different serialization approaches for Java objects First well discuss Javas Native APIs for serialization Next well explore libraries that support JSON and YAML formats to do the same Finally well take a look at some crosslanguage protocols";

        printList(getListOfWords(text));
    }

    private static void printList(List<String> stringList) {
        System.out.println(stringList);
    }

    private static List<String> getListOfWords(String text) {
        return Arrays.stream(text.split(" "))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}