package test_05_17;

@SuppressWarnings("ALL")
public class ObjectTest {
    public static void main(String[] args) {
        //构造方法,用于创建对象
        Persons p = new Persons("test", '男', 18);
        //实际传的是地址
        sum(p);
        System.out.println(p.age);
        sum1(p);
        System.out.println(p.age);
    }

    //通过地址找到对应的对象
    private static int sum(Persons p) {
        return p.age += 5;
    }

    //创建新的对象，新的地址赋给p
    private static int sum1(Persons p) {
        return p.age += 5;
    }

}

@SuppressWarnings("ALL")
class Persons {
    String name;
    char gender;
    int age;

    Persons(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @SuppressWarnings("WeakerAccess")
    public void eat() {
        System.out.println("吃饭");
    }

    @SuppressWarnings("WeakerAccess")
    public void sleep() {
        System.out.println("睡觉");
    }
}
