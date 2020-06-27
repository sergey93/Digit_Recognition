import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int minSeed = a;
        int min = k;
        for (int i = 0; i < b - a + 1; i++) {
            int seed = a + i;
            int max = 0;
            Random random = new Random(seed);
            for (int j = 0; j < n; j++) {
                max = Math.max(random.nextInt(k), max);
            }
            if (max < min) {
                minSeed = seed;
                min = max;
            }
        }
        System.out.println(minSeed);
        System.out.println(min);

    }
}