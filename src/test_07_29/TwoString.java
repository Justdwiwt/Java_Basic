package test_07_29;

@SuppressWarnings("Duplicates")
public class TwoString {
    @SuppressWarnings("LoopStatementThatDoesntLoop")
    public static void func5() {
        String a = "abc";
        String b = "def";
        StringBuilder sb = new StringBuilder();
        b = sb.append(b).reverse().toString();
        char[] key = new char[a.length() + b.length()];
        for (int i = 0, j = 0; i < key.length; i += 2)
            for (; j < a.length(); ) {
                key[i] = a.charAt(j);
                j++;
                break;
            }
        for (int i = 1, j = 0; i < key.length; i += 2)
            for (; j < b.length(); ) {
                key[i] = b.charAt(j);
                j++;
                break;
            }
        System.out.println(key);
    }
}
