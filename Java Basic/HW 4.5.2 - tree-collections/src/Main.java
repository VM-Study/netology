import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Candidate> listOfCandidate = new TreeSet<>(
                Comparator.comparing(Candidate::getRelevance).thenComparing(Candidate::getRating).reversed());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите информацию о кандидате (для завершения введите пустую строку):");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Конец ввода сотрудников.");
                break;
            }
            String[] contact = input.split(" ");
            if (contact.length != 6) {
                System.out.println("Ошибка ввода информации контакта.");
                continue;
            }
            Candidate.createCandidate(contact[0] + " " + contact[1] + " " + contact[2],
                    contact[3], Integer.parseInt(contact[4]), Integer.parseInt(contact[5]), listOfCandidate);
        }
        Candidate.createCandidate("Иванов Иван Пушкин", "муж", 4, 5, listOfCandidate);
        Candidate.createCandidate("Петров Иван Лермонтов", "муж", 4, 3, listOfCandidate);
        Candidate.createCandidate("Сидоров Сергей Брежнев", "муж", 3, 5, listOfCandidate);
        Candidate.createCandidate("Василий Иванович Ленин", "муж", 3, 8, listOfCandidate);
        Candidate.createCandidate("Юрий Петрович Ельцин", "муж", 3, 5, listOfCandidate);
        Candidate.createCandidate("Миша Мишевич Путин", "муж", 4, 4, listOfCandidate);
        Candidate.createCandidate("Саша Сашавеч Сталин", "муж", 3, 1, listOfCandidate);
        Candidate.createCandidate("Юра Иванович Хрушев", "муж", 5, 8, listOfCandidate);
        Candidate.createCandidate("Саша Иванович Сидоров", "муж", 3, 2, listOfCandidate);
        Candidate.createCandidate("Петя Петявич Иванов", "муж", 8, 9, listOfCandidate);
        Candidate.createCandidate("Мика Микавич Сергеев", "муж", 5, 5, listOfCandidate);
        Candidate.createCandidate("Мышка Мышкавич Петрович", "муж", 4, 6, listOfCandidate);

        Candidate.printAllCandidats(listOfCandidate);


    }
}
