public class Floorfunc {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9, 11, 14, 20, 25 };
        int target = 1;
        int ans = FloorFunc(arr, target);
        System.out.println(ans);

    }

    // Will return the index at which the ceil number is present
    static int FloorFunc(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return end;
        // return arr[start];
        // Check for smallest greater element .
    }
}
