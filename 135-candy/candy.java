class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        Arrays.fill(left, 1);

        // Left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        int total = 0;
        int right = 1; // Start from the rightmost element

        // Right to left and compute total
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right += 1;
            } else {
                right = 1;
            }

            // Take the max from both directions
            total += Math.max(left[i], right);
        }

        return total;
    }
}
