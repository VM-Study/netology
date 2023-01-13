public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Терминатор", 2020, 18),
                new Movie("Робокоп", 2005, 14)
        };
    }

    public static Movie[] getTheatres() {
        return new Movie[]{
                new Movie("Анна Каренина", 2017, 16),
                new Movie("", 2018, 12),
                new Movie("Кукущка", 2011, 18)
        };
    }

    public static void validEvent(Event event) {
        if (event.title.equals("")) {
            throw new RuntimeException("Title is empty.");
        }
        if (event.releaseYear == 0 ) {
            throw new RuntimeException("Release Year is 0.");
        }
        if (event.age == 0 ) {
            throw new RuntimeException("Age Year is 0.");
        }
    }

    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны!");
    }

}
