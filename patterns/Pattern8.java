public class Pattern8 {
    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n) {
        // outer loop will run 2n times
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {

                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {

                System.out.print(col);
            }
            System.out.println("");
        }
    }
}

// 1
// 212
// 32123
// 4321234
// 543212345