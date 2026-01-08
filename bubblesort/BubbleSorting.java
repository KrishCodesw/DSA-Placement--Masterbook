
import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {

        // int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr = { 1, 2, 3, 4, 5 };
        bubbleSOrt(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSOrt(int[] arr) {
        // running the cycle n-1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // for each step , the max item will come at the last respective index

            for (int j = 1; j < arr.length - i; j++) {
                // swap if item is smaller that the previous item (j<j-1 ---> swap)
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // did not swap even once ---means array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
