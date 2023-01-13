public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder().setName("Анна").setSurname("Вольф").setAge(31).setAddress("Сидней").build();
        Person son = mom.newChildBuilder().setName("Антошка").build();
        System.out.println(mom);
        System.out.println(son);
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println("[ERROR] Не возможно создать Person не указана фамилия! " + e);
            e.printStackTrace();
        }
        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] Возраст не может быть отрицательным! " + e);
            e.printStackTrace();
        }
    }
}
