public class RotatedArr {
    static int findPivot(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > mid + 1 || mid < mid - 1) {
                return mid;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr, target);
        int start = 0;
        int end = pivot;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 11, 12, 2, 4, 5, 7, 8 };
        int target = 8;
        int ans = search(arr, target);
        System.out.println(ans);
    }
}