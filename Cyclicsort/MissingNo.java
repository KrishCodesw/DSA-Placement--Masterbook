public class MissingNo {
    // Nos from 0 to n so total n+1 numbers
    // ex. n=4 , arr=[4,0,2,1] in ideal case [0,1,2,'3',4]

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int ans = missingNo(arr);
        System.out.println(ans);
    }

    static int missingNo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
