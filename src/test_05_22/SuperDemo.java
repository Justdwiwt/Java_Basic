package test_05_22;

public class SuperDemo {
    public static void main(String[] args) {
        Pig p = new Pig();
        p.eat();
    }
}


class Animal {
    public Animal() {
    }

    public Animal(String name) {
    }

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }
}

class Pig extends Animal {
    public Pig() {
        super();
    }

    public Pig(String name) {
        super();
    }

    @Override
    public void eat() {
        System.out.println("猪在吃");
        super.sleep();
    }
}
