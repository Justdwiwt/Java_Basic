package test_05_17;

public class ThisDemo {

    public static void main(String[] args) {
        Student s = new Student("test1", '男', 18);
        System.out.println(s.name + s.gender + s.age);
    }
}

@SuppressWarnings("ALL")
class Student {
    String name;
    char gender;
    int age;

    public Student() {
    }

    public Student(String name, char gender, int age) {
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

    private void study() {
        System.out.println(this.name + "在学习");
    }
}
