package test_05_18;

public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human(10);
        h.gender = '女';
        h.name = "test";
        h.a(5);
        h.eat();
        h.sleep();
        System.out.println(h.a());
    }
}

class Human {
    String name;
    private int age;
    char gender;

    public Human(int age) {
        this.age = age;
    }

    public int a() {
        return this.age;
    }

    public void a(int age) {
        if (age < 0)
            return;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}