/*Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing. 

Examples:

Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.
Expected Time Complexity: O(n)
Expected Auxilliary Space: O(n) */

class Solution{
        public static int firstRepeated(int[] arr) {
        
        HashMap<Integer,Integer>ob=new HashMap<>();
        
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
         if(ob.containsKey(arr[i]))
         {
             ob.put(arr[i],ob.get(arr[i])+1);
         }
         else{
             
             ob.put(arr[i],1);
            
             
             }
        }
        for(int i=0;i<ob.size();i++)
        {
            if(ob.get(arr[i]) >=2)
            {
                return i+1;
            }
        }
        return -1;
        
       
    }

}