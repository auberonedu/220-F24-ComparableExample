public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public double heightInches;

    public Person(String name, int age, double heightInches) {
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
    }

    public int compareTo(Person other) {
        return this.age - other.age;
    }

    public String toString() {
        return name;
    }
}
