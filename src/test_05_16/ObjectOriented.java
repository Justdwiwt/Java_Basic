package test_05_16;

public class ObjectOriented {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "zxc";
        p.sex = 'a';
        p.age = 18;
        p.eat();
        p.sleep();
    }
}

@SuppressWarnings("ALL")
class Person {
    String name;
    char sex;
    int age;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}