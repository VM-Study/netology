import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Иванов Петр Николаевич, 1243-Б, 31231343
            System.out.println("Введите информацию о студенте: 'ФИО, номер группы, номер студенческого билета':");
            String value = scanner.nextLine();
            if ("end".equals(value)) {
                System.out.println("Конец ввода информации.");
                break;
            }
            String[] words = value.split(",");
            if (words.length != 3) {
                System.out.println("Ошибка ввода информации.");
                continue;
            }
            createStudent(studentList,words[0].trim(), words[1].trim(), words[2].trim());
        }
        printAllStudents(studentList);
    }

    public static void createStudent(Set<Student> studentList, String name, String group, String studentId) {
        Student newStudent = new Student(name, group, studentId);
        if (studentList.add(newStudent) ) {
            System.out.println("Студент '" + name + "' добавлен.");
        } else {
            System.out.println("Ошибка добавления студента '" + name + "'.");
        }

    }

    public static void printAllStudents(Set<Student> studentList) {
        System.out.println("Список студентов:");
        for(Student student : studentList) {
            System.out.println(student);
        }
    }
}
