public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] arr = { 17, 25, 41, 86, 89, 92 };
        int target = 25;
        int start = 0;
        int end = arr.length - 1;
        int ans = search(arr, target);
        System.out.println("Iterative approach: " + ans);
        int ans2 = rsearch(arr, target, start, end);
        System.out.println("Recursive approach: " + ans2);
    }

    static int search(int[] arr, int target) {
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
        return -1;
    }

    static int rsearch(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
                return rsearch(arr, target, start, end);
            } else if (target > arr[mid]) {
                start = mid + 1;
                return rsearch(arr, target, start, end);
            } else {
                return mid;
            }
        }
        return -1;
    }
}