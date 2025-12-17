public class Ceilingfunc {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 14, 20, 25 };
        int target = 15;
        int ans = CeilingFunc(arr, target);
        System.out.println(ans);

    }

    // Will return the index at which the ceil number is present
    static int CeilingFunc(int[] arr, int target) {
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
        return start;
        // return arr[start];
        // Check for smallest greater element .
    }
}
