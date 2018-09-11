package test_05_23;

public class StaticTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "test";
        p.age = 18;
        Person.gender = '1';
        System.out.println(p.toString());
    }
}

class Person {
    String name;
    int age;
    static char gender;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }

    public void eat() {
        System.out.println("eat");
    }
}