import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1, 2, 4, 5, 6, 8, 90, 0);
        fun2(1, 2, "1", "82", "282834", "39839");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    // Vararg should come always at the end.

    static void fun2(int a, int b, String... v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}

// When the number of parameters is unknown

// Function overloading

// No of params or type of params should be different with the same function
// name.