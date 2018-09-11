package test_05_17;

public class ObjectDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Test";
        p.gender = '男';
        p.age = 18;
        p.eat();
        p.sleep();
    }
}

class Person {
    String name;
    char gender;
    int age;

    @SuppressWarnings("WeakerAccess")
    public void eat() {
        System.out.println("吃饭");
    }

    @SuppressWarnings("WeakerAccess")
    public void sleep() {
        System.out.println("睡觉");
    }
}
