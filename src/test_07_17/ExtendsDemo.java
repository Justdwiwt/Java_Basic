package test_07_17;

public class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.nam = "syskey";
        s.ag = 20;
        s.say();
    }
}

class Persons {
    public String nam;
    public int ag;

    public Persons() {
        System.out.println("父类");
        say();
    }

    public void say() {
        System.out.println("人会说话");
    }
}

class Student extends Persons {
    public String school;

    public Student() {
        System.out.println("子类");
    }

    public void say() {
        System.out.println("学生说:" + nam + ag);
    }
}
