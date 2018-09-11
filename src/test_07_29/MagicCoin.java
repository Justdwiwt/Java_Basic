package test_07_29;

@SuppressWarnings("Duplicates")
public class MagicCoin {
    @SuppressWarnings("UnnecessaryReturnStatement")
    private static void magicCoin(long n) {
        if (n == 0)
            return;
        else if (n % 2 == 1) {
            magicCoin((n - 1) / 2);
            System.out.print("1");
        } else {
            magicCoin((n - 2) / 2);
            System.out.print("2");
        }
    }
}
