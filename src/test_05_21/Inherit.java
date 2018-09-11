package test_05_21;

public class Inherit {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.name = "test";
        d.treat();
    }
}

class MedicalStaff {
    String name;
    int age;
    char gender;
    String dept;
    int num;

    public void treat() {
        System.out.println(this.name + "在治病");
    }

    public String s() {
        return "success";
    }
}

class Doctor extends MedicalStaff {
    @Override
    public void treat() {
        System.out.println(this.name + "拿着手术刀在治病");
    }

    @Override
    public String s() {
        return null;
    }
}

class Nurse extends MedicalStaff {

}