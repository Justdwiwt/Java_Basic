package test_06_01;

import java.util.Objects;

public class ObjectEquals {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        p1.setName("p1");
        p1.setGender('女');
        Person p2 = new Person();
        p2.setAge(11);
        p2.setName("p2");
        p2.setGender('男');
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
    }
}

class Person {
    private String name;
    private char gender;
    private int age;

    @SuppressWarnings("StringEquality")
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj)
                return true;
            else if (this.getClass() == obj.getClass())
                if (this.age == ((Person) obj).age)
                    if (this.gender == ((Person) obj).gender)
                        return this.name == ((Person) obj).name || this.name != null && this.name.equals(((Person) obj).name);
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
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
}

class Student {
    private String name;
    private int age;
    private char gender;
    private String number;

//    @SuppressWarnings("StringEquality")
//    @Override
//    public boolean equals(Object obj) {
//        if (obj != null) {
//            if (this == obj)
//                return true;
//            else if (this.getClass() == obj.getClass()) {
//                Student stu = (Student) obj;
//                if (this.age == stu.age) if (this.gender == stu.gender)
//                    if (this.name == stu.name || this.name != null && this.name.equals(stu.name))
//                        return this.number == stu.number || this.number != null && this.number.equals(stu.number);
//            }
//            return false;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                gender == student.gender &&
                Objects.equals(name, student.name) &&
                Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, gender, number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", number='" + number + '\'' +
                '}';
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
