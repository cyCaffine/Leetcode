class Solution {

    int solve(int [] cost, int n, int dp[]){
        if(n == 0){
            return cost[0];
        }
        if(n ==  1){
            return cost[1];
        }
        // /step 3
        if(dp[n] != -1){
            return dp[n];
        }
        // step2
        dp[n] = cost[n] + Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        // step one
        // int [] dp = new int[n+1, -1];
         int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = Math.min(solve(cost,n-1, dp), solve(cost, n-2, dp));
        return ans;
        
    }
}