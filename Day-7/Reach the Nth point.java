/*There are N points on the road, you can step ahead by 1 or 2 . If you start from a point 0, and can only move from point i to point i+1 after taking a step of length one, find the number of ways you can reach at point N. 

Example 1:

Input: 
N = 4
Output: 
5
Explanation: Number of ways to reach at 4th
point are {1, 1, 1, 1}, {1, 1, 2},
{1, 2, 1} {2, 1, 1}, {2, 2}. */

class Solution
{
    public int nthPoint(int n)
    {
        int dp[]=new int[n+1];
        
        Arrays.fill(dp,-1);
        
        return path(n,dp);
    }
    
    public int path(int n,int dp[])
    {
        if(n==0)
        {
            return 1;
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        int left=path(n-1,dp);
        int right=0;
        if(n>1)
        {
        right=path(n-2,dp);
        }
        
        return dp[n]=(left+right)%1000000007;
    }
}