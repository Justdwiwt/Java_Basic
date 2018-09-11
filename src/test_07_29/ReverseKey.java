package test_07_29;

@SuppressWarnings("Duplicates")
public class ReverseKey {
    private static void reverse() {
        String str = "I like beijing.";
        String[] t = str.split(" ");
        String tmp = "";
        for (int i = t.length - 1; i >= 0; i--) {
            tmp += t[i];
            if (i > 0)
                tmp += " ";
        }
        System.out.println(tmp);
    }

    private static void reString(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0)
                sb.append(" ");
        }
        System.out.println(sb);
    }
}
