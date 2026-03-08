public class Pattern2 {

    public static void main(String[] args) {
        Patternno2(3);
    }

    static void Patternno2(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

// * * * *
// * * * *
// * * * *
// * * * *