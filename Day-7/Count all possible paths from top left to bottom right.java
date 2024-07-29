/*The task is to count all the possible paths from top left to bottom right of a m X n matrix with the constraints that from each cell you can either move only to right or down.

Example 1:

Input: m = 2, n = 2
Output: 2 
Explanation: Two possible ways are
RD and DR.  

Example 2:

Input: m = 3, n = 3
Output: 6
Explanation: Six possible ways are
RRDD, DDRR, RDDR, DRRD, RDRD, DRDR.*/

class Solution
{
    long paths(int m,int n,long dp[][])
    {
        if(n==1 || m==1)
        {
            return 1;
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        long left=paths(m,n-1,dp);
        long right=paths(m-1,n,dp);
        
        return dp[m][n]=((left)%1000000007+(right)%1000000007)%1000000007;
    }
    long numberOfPaths(int m, int n)
    {
        long dp[][]=new long[m+1][n+1];
        
        for(long r[]:dp)
        {
            Arrays.fill(r,-1);
        }
       return  paths(m,n,dp);
    }
}