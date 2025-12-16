public class Binaryy {
    public static void main(String[] args) {
        int[] arr = { 1, 26, 255, 647, 752, 6555, 6782 };
        int target = 6782;
        int ans = Binarysearch(arr, target);
        System.out.println(ans);
    }

    // Return the index of the element to be searched ; if not return -1
    // Assume that the array is sorted
    static int Binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid=(start+end)/2;
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
}