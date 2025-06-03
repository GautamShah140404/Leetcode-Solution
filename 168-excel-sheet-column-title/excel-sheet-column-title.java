class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            // Find remainder
            int rem = n % 26;
            // If remainder is 0, then a 'Z' 
            // must be there in output
            if (rem == 0) {
                res.append('Z');
                n = (n / 26) - 1;
            }
            // If remainder is non-zero
            else {
                res.append((char) ((rem - 1) + 'A'));
                n = n / 26;
            }
        }
        // Reverse the string
        res.reverse();
        return res.toString();
    }
}