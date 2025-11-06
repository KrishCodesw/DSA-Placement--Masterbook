public class Swap {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println(a + " " + b);
        swap(10, 20);
        String name = "Kunal Kushwaha ";
        ChangeName(name);
        System.out.println(name);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(b + " " + a);
    }

    // This function does not swap the value.
    // Reason --- >
    // Pass of an arguement

    static void ChangeName(String naam) {
        naam = "Rahul Rana";
        System.out.println("hello " + naam);

    }

    // When name is passed in this method -- The value of the reference variable
    // (name) is
    // passed.
    // naam will be another ref. variable which is a copy of name ((In java only
    // pass by value )) NO pass by reference.

    // Same is with this string example
}