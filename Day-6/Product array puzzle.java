/*Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.*/
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
      long res[]=new long[n];
      
      long left[]=new long [n];
      
      left[0]=1;
      
      
      for(int i=1;i<n;i++)
      {
          left[i]=left[i-1]*nums[i-1];
      }
      
      long right=1;
      
      for(int i=n-1;i>=0;i--)
      {
          res[i]=left[i]*right;
          
          right=right*nums[i];
      }
      
      
      return res;
	} 
} 