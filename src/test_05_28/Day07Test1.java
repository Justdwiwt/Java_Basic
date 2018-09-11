package test_05_28;

public class Day07Test1 {
    public static void main(String[] args) {
        Animal[] as = new Animal[]{
                new Dog("Pluto"),
                new Cat("Tom"),
                new Dog("Snoopy"),
                new Cat("Garfield")
        };
        Dog[] dogs = getAllDog(as);
        for (int i = 0; i <= dogs.length; i++) {
            System.out.println(dogs[i].getName());
        }

    }

    public static Dog[] getAllDog(Animal[] as) {
        //4
        int sumDog = 0;
        for (Animal a : as)
            if (a instanceof Dog)
                sumDog++;
        int dogIndex = 0;
        Dog[] dogs = new Dog[sumDog];
        for (Animal a : as)
            if (a instanceof Dog) {
//                dogs[dogIndex] == a;
                dogIndex++;
            }
        return dogs;
    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //1

}

class Dog extends Animal {
    public Dog(String pluto) {

    }

    //2

}

class Cat extends Animal {
    public Cat(String tom) {

    }
    //3

}