public class Infinitearraysearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 17, 25, 34, 54, 65 };
        int target = 5;
        int ans = findans(arr, target);
        System.out.println(ans);

    }

    static int findans(int[] arr, int target) {
        // find the range in which target is present in the infinite array
        // start with first 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value ---- newEnd= (index of end) + (size of new chunk ; 4)
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
