import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Начало фильтрации");

        for (Integer number : source) {
            if (number < treshold) {
                logger.log("Элемент " + number + " пройден.");
                result.add(number);
            } else {
                logger.log("Элемент " + number + " отфильтрован.");
            }
        }
        logger.log("Конец фильтрации");
        return result;
    }
}