public class MaxAndPair {
    public static int maxAND(int[] arr) {
        int res = 0;

        // Iterate from MSB (31) to LSB (0)
        for (int bit = 31; bit >= 0; bit--) {
            // Create a pattern for the current bit plus previously found bits
            int pattern = res | (1 << bit);

            // Count how many numbers in the array match this pattern
            int count = countMatches(pattern, arr);

            // If 2 or more numbers match, this bit can be part of the max AND
            if (count >= 2) {
                res = pattern;
            }
        }
        return res;
    }

    // Helper to check how many numbers have 'pattern' bits set
    private static int countMatches(int pattern, int[] arr) {
        int count = 0;
        for (int num : arr) {
            if ((num & pattern) == pattern) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxAND(arr));
    }
}
