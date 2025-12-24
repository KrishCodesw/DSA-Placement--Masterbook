public class RBSduplicateelement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 9, 2, 3, 2 };
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        int pivot = findPivot(arr);
        System.out.println(pivot);
        int ans = bsearch(arr, target);
        System.out.println(ans);
    }

    // WIll not work with array with duplicate elements
    static int bsearch(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return Binarysearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return Binarysearch(arr, target, 0, pivot); // Search left side
        } else {
            return Binarysearch(arr, target, pivot + 1, arr.length - 1); // Search right side
        }

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end - 1] > arr[end]) {
                    return end;
                }
                end--;
            }

            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            // if (arr[mid] <= arr[start]) {
            // end = mid - 1;
            // } else {
            // start = mid + 1;
            // }

        }
        return -1;
    }

    static int Binarysearch(int[] arr, int target, int start, int end) {

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
