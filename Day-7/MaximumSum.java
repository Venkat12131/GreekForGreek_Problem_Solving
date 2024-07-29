/*A number n can be broken into three parts n/2, n/3, and n/4 (consider only the integer part). Each number obtained in this process can be divided further recursively. Find the maximum sum that can be obtained by summing up the divided parts together.
Note: It is possible that we don't divide the number at all.

Example 1:

Input:
n = 12
Output: 
13
Explanation: 
Break n = 12 in three parts {12/2, 12/3, 12/4} = {6, 4, 3}, now current sum is = (6 + 4 + 3) = 13. Further breaking 6, 4 and 3 into parts will produce sum less than or equal to 6, 4 and 3 respectively.*/

class Solution
{
    public int maxSum(int n) 
    { 
        if(n==0) return 0;
        
        int n1 = maxSum(n/2);
        int n2 = maxSum(n/3);
        int n3 = maxSum(n/4);
        
        int sum = n1+n2+n3;
        return Math.max(sum, n);
    } 
}
