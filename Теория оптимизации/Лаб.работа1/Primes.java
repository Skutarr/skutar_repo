public class Primes {
    public static void main(String[] args) {
        int x, y;
        for (x = 1; x <101; x++) {
            y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2)
                System.out.println(x);

        }
    }
}
