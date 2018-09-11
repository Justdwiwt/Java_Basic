package test_05_22;

public class DTDemo {
    public static void main(String[] args) {
        Pet p = new Dog();
        p.eat();
    }
}

class Pet {
    public void eat() {
        System.out.println("吃");
    }
}

class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("狗在吃");
    }

    public void bark() {
        System.out.println("狗在叫");
    }
}

class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("猫在吃");
    }

    public void moZ() {
        System.out.println("猫在磨爪子");
    }
}