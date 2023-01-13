import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Bob", "bob@gmail.com", "pass", 34);
        User user3 = new User("vasya", "vasya@gmail.com", "pass", 14);

        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] user = getUsers();
        for (User users : user) {
            if (users.password.equals(password) && users.login.equals(login)) {
                return users;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("Age < 18");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter login:");
        String login = scaner.nextLine();
        System.out.println("Enter password:");
        String password = scaner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);

        System.out.println("Access granted!");
    }
}
