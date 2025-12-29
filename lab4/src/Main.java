class Person {
    private String lastName;
    private int age;
    private String gender; // "M" - мужчина, "F" - женщина

    public Person(String lastName, int age, String gender) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[10];

        people[0] = new Person("Иванов", 20, "M");
        people[1] = new Person("Петров", 25, "M");
        people[2] = new Person("Сидорова", 22, "F");
        people[3] = new Person("Смирнов", 30, "M");
        people[4] = new Person("Кузнецова", 27, "F");
        people[5] = new Person("Волков", 35, "M");
        people[6] = new Person("Морозова", 24, "F");
        people[7] = new Person("Фёдоров", 28, "M");
        people[8] = new Person("Николаева", 21, "F");
        people[9] = new Person("Орлов", 40, "M");

        int sumAge = 0;
        int menCount = 0;

        for (Person p : people) {
            sumAge += p.getAge();
            if (p.getGender().equals("M")) {
                menCount++;
            }
        }

        double averageAge = (double) sumAge / people.length;

        System.out.println("Средний возраст: " + averageAge);
        System.out.println("Количество мужчин: " + menCount);
    }
}

