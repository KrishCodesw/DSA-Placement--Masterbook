// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class EvenDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean even(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        EvenDigits obj = new EvenDigits();
        int[] nums = { 1, 2525, 54, 8, 52, 55, 5 };
        int answer = obj.findNumbers(nums);
        System.out.println(answer);

    }

}