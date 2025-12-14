public class RichestCustomer {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = Integer.MIN_VALUE;
            for (int customer = 0; customer < accounts.length; customer++) {
                int rowsum = 0;
                // Whenever add a new coloumn , take a sum of that row
                for (int bank = 0; bank < accounts[customer].length; bank++) {
                    rowsum += accounts[customer][bank];
                }
                if (rowsum > max) {
                    max = rowsum;
                }
            }
            return max;
        }
    }
}
