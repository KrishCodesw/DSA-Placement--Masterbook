public class PrettyPrint {
    public static void main(String[] args) {
        float a = 3254.41235f;
        System.out.printf("Formatted num is %.2f", a);

        String series = "";
        for (int i = 0; i <= 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
            System.out.println(ch);
            System.out.println(series.toString());
        }

    }
}
