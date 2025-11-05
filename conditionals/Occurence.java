import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {

        System.out.println("enter a big ass num: ");
        Scanner in = new Scanner(System.in);
        // Two ways to solve this : - convert to string and do a for loop at
        // str.length() with charAt() or n%10 wala method
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n / 10;

        }
        System.out.println(count);

    }
}
