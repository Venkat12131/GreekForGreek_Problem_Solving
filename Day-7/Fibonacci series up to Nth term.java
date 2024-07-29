/* = 5
Output:
0 1 1 2 3 5
Explanation:
0 1 1 2 3 5 is the Fibonacci series up to the 5th term.*/
class Solution {

    int[] Series(int n) {
    
        
        int res[]=new int[n+1];
        res[0]=0;
        res[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            res[i]=(res[i-1]+res[i-2])%1000000007;
            
            
        }
        return res;
    }
}