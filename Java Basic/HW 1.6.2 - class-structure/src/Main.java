public class Main {
    public static void main(String[] args) {
        Author authorLukyanov = new Author("Анатолий","Лукьянов", 1971,"Russia");
        Book bookJavaCore = new Book(authorLukyanov,456,1991);
        User userVasya = new User("ya@ya.ru","Vasya","Petrov",bookJavaCore);

        System.out.println(userVasya);

    }
}
