/*Given an infinite supply of each denomination of Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
Find the minimum number of coins and/or notes needed to make the change for Rs N. You must return the list containing the value of coins required. 


Example 1:

Input: N = 43
Output: 20 20 2 1
Explaination: 
Minimum number of coins and notes needed 
to make 43. */

class Solution{
    static List<Integer> minPartition(int N)
    {
        ArrayList<Integer>res=new ArrayList<>();
        
        int arr[]={1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        for(int i=arr.length-1;i>=0;i--)
        {
            while(arr[i]<= N)
            {
                
                res.add(arr[i]);
                N=N-arr[i];
                
            }
        }
        return res;
        
    }
}