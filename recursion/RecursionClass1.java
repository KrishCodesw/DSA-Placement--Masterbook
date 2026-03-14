public class RecursionClass1 {
    public static void main(String[] args) {

        Hello();

    }

    static void Hello() {
        System.out.println("Helo");
        Hello2();
    }

    static void Hello2() {
        System.out.println("Helo");
        Hello3();
    }

    static void Hello3() {
        System.out.println("Helo");
        Hello4();
    }

    static void Hello4() {
        System.out.println("Helo");
    }
}