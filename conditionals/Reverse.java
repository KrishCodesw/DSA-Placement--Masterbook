public class Reverse {
    public static void main(String[] args) {
        int num = 29131113;
        int reversedans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            reversedans = reversedans * 10 + rem;
        }
        System.out.println("Reverse number: " + reversedans);
    }
}
