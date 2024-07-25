/* You are given an array a, of n elements. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1. 


/* the instution  is straight if z is present x=i same y is also present i  calculate the min diff of xi && yi indexs*/


*/
class Solution {
    int minDist(int a[], int n, int x, int y) {
       
       int res=Integer.MAX_VALUE;
       
       int xi=-1,yi=-1;
       
       for(int i=0;i<n;i++)
       {
           if(a[i]==x)
           {
               xi=i;
           }
           if(a[i]==y)
           {
               yi=i;
           }
           
           if(xi!=-1 && yi!=-1)
           {
               res=Math.min(res,Math.abs(xi-yi));
           }
       }
       
       if(res==Integer.MAX_VALUE)
       {
           return -1;
       }
       
       return res;
    }
}