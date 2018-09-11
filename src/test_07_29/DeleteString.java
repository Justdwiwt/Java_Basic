package test_07_29;

public class DeleteString {
    private static void deleteString() {
        String a = "They are students.";
        String b = "aeiou";
        for (int i = 0; i < b.length(); i++)
            a = a.replaceAll("" + b.charAt(i), "");
        System.out.println(a);
    }
}
