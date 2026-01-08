import java.util.Arrays;

public class BinarySearchSorted2Dmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }
        // run the loop till 2 rows are remaining
        int rstart = 0;
        int rend = rows - 1;
        int cmid = col / 2;
        while (rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[] { mid, cmid };
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }

        }

        // now we have 2 rows
        // check whether the target is in the coloumn of 2 rows
        if (matrix[rstart][cmid] == target) {
            return new int[] { rstart, cmid };
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[] { rstart + 1, cmid };
        }
        // search in 1st half,2nd and 3rd and 4th
        // 1st half
        if (target <= matrix[rstart][cmid - 1]) {
            return binarySearch(matrix, rstart, 0, cmid - 1, target);
        }
        if (target >= matrix[rstart][cmid + 1]) {
            return binarySearch(matrix, rstart, cmid + 1, col - 1, target);
        }
        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binarySearch(matrix, rstart + 1, 0, cmid - 1, target);
        } else {
            return binarySearch(matrix, rstart + 1, cmid + 1, col - 1, target);
        }
    }

}
