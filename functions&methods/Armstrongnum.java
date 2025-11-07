import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // System.out.println(Armstrong(n));

        for (int i = 100; i < 1000; i++) {
            if (Armstrong(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean Armstrong(int n) {
        int sum = 0;
        int orignal = n;
        // MAJOR MISTAKE - STORE THE ORIGNAL NUM AS WELL TO COMPARE
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem * rem * rem;
        }
        return (sum == orignal);
    }
}
