import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] num = { 23, 16, 5, 55, 8, 7 };
        int target = 45;
        int ans = LinearSearch(num, target);
        System.out.println(ans);

        String name = "Krish";
        char target1 = 's';
        boolean truename = LinearSearch(name, target1);
        System.out.println(truename);
        System.out.println(Arrays.toString(name.toCharArray()));

        int minimum = min(num);
        int maximum = max(num);
        System.out.println(minimum);
        System.out.println(maximum);

        int[][] arr = new int[][] {
                { 23, 5, 54, 77, 4 },
                { 14, 5, 7, 5, 44, 77 },
                { 14, 776, 2, 45, 48 },
        };

        int[] answer = search(arr, target);
        System.out.println(Arrays.toString(answer));
        System.out.println(Integer.MIN_VALUE);

    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    static boolean LinearSearch(String s, char target1) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target1) {
                return true;
            }
        }
        return false;
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] search(int[][] arr, int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[] { r, c };
                }
            }
        }
        return new int[] { -1, -1 };
    }
};