public class OrderAGBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 1, 26, 255, 647, 752, 6555, 6782 };
        int[] arr = { 2845, 1025, 594, 250, 144, 98, 78, 6 };
        int target = 144;
        int ans = OrderAGBinary(arr, target);
        System.out.println(ans);
        // Ascending or Descending is not known by default .
    }

    static int OrderAGBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid=(start+end)/2;
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
