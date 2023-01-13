public class PersonBuilder {
    public String name;
    public String surname;
    public int age = -1;
    public String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }

        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.surname == null || this.name == null) {
            throw new IllegalStateException();
        }

        Person person;
        if (age > -1) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        if (!this.address.isEmpty()) {
            person.setAddress(this.address);
        }
        return person;
    }
}