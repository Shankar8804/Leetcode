class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev2 = 1; // ways(0)
        int prev1 = 1; // ways(1)
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2; // ways(i) = ways(i-1) + ways(i-2)
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
