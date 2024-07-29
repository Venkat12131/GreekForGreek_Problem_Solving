/*A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top of Nth step. As the answer will be large find the answer modulo 1000000007.

Example 1:

Input:
N = 1
Output: 1
Example 2:

Input:
N = 4
Output: 7
Explanation:Below are the 7 ways to reach
4
1 step + 1 step + 1 step + 1 step
1 step + 2 step + 1 step
2 step + 1 step + 1 step
1 step + 1 step + 2 step
2 step + 2 step
3 step + 1 step
1 step + 3 step */

class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    
    static long count(int n,long dp[])
    {
        if(n==0)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        long left=count(n-1,dp);
        long right=0,third=0;
        if(n>1)
        {
         right=count(n-2,dp);
        }
        
        if(n>2)
        {
             third=count(n-3,dp);
        }
        
        return dp[n]=(left+right+third)%1000000007;
    }
    static long countWays(int n)
    {
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
       return count(n,dp);
    }
    
}
