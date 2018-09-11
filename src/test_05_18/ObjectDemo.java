package test_05_18;

public class ObjectDemo {
    public static void main(String[] args) {
        Baby b = new Baby();
        //匿名对象
//        new Baby();
        OBDemo(new Baby("1111"));
        b.cry();
        b.eat();
        System.out.println(b.age);
    }

    public static void OBDemo(Baby b) {
    }
}

class Baby {
    String name;
    int age;
    char gender;

    public Baby() {
        this.age = 1;
        this.gender = '女';
    }

    public Baby(String name) {
        this.name = "四个字的";
        this.age = 1;
        this.gender = '女';
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

    public void cry() {
        System.out.println("哭");
    }

    public void eat() {
        System.out.println("吃");
    }
}