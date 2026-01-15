
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 1, 4 };
        Cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void Cyclesort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i] - 1;
            if (arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            } else {
                i++;
            }
        }
    }
}