class Solution {
    public int fib(int n) {
        // if(n == 0 || n == 1)return n;
        // int n1 = fib(n-1);
        // int  n2 = fib(n-2);
        // return n1+n2;

        
        // Handle the base cases where n is 0 or 1
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }

      // Initialize the dp array to store Fibonacci numbers up to n
    int[] dp = new int[n + 1];

    // Base cases
    dp[0] = 0;
    dp[1] = 1;

    // Fill the dp array using the bottom-up approach
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    // Return the nth Fibonacci number
    return dp[n];
    }
}