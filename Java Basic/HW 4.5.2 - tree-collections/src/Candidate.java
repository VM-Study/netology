import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Candidate implements Comparable<Candidate> {
    String fio;
    String gender;
    int relevance;
    int rating;

    public Candidate(String fio, String gender, int relevance, int rating) {
        this.fio = fio;
        this.gender = gender;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(fio, candidate.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    public static void createCandidate(String fio, String gender, int relevance, int rating, Set<Candidate> listOfCandidate) {
        Candidate candidate = new Candidate(fio, gender, relevance, rating);
        //System.out.println("  - Пользователь " + fio + " создан.");
        addCandidateInList(candidate, listOfCandidate);

    }

    public static void addCandidateInList(Candidate candidate, Set<Candidate> listOfCandidate) {
        listOfCandidate.add(candidate);
        System.out.println("  - Пользователь " + candidate.fio + " Добавлен в список.");
    }

    public static void printAllCandidats(Set<Candidate> listOfCandidate) {
        System.out.println("ФИО, Релевантность резюме, Оценка на собеседовании");
        for (Candidate candidate : listOfCandidate) {
            System.out.println("  " + candidate.fio + ", " + candidate.relevance + ", " + candidate.rating);
        }
    }

    @Override
    public String toString() {
        return fio + ", " + gender + ", " + relevance + ", " + rating;
    }

    @Override
    public int compareTo(Candidate o) {
        return fio.compareTo(o.fio);
    }
}
