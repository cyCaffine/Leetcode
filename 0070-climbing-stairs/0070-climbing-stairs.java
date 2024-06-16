class Solution {
    public int climbStairs(int n) {
        
        // Declare a dp[] array of size n+1.
        int [] dp = new int[n + 1];
         return f(n, dp);
    }
   

    public int f(int n, int[] dp){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = f(n-1, dp) + f(n-2, dp);
    }
}