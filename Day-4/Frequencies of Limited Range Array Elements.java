/*Given an array arr[] of n positive integers which can contain integers from 1 to p where elements can be repeated or can be absent from the array.
Your task is to count the frequency of all numbers from 1 to n. Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.

Note: The elements greater than n in the array can be ignored for counting. 

Examples

Input: n = 5 arr[] = {2, 3, 2, 3, 5} p = 5
Output: 0 2 2 0 1
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1 time.*/
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
      HashMap<Integer,Integer>map=new HashMap<>();
      
      for(int i=0;i<N;i++)
      {
          if(!map.containsKey(arr[i]))
          {
              map.put(arr[i],1);
          }
          else{
              map.put(arr[i],map.get(arr[i])+1);
          }
      }
      for(int i=1;i<=N;i++)
      {
          if(map.containsKey(i))
          {
              arr[i-1]=map.get(i);
          }
          else{
              arr[i-1]=0;
          }
      }
      
    }
}