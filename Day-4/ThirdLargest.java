/*Given an array, arr of distinct elements. Find the third largest element in it. Return -1 if third largest element is not found.

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The third largest element in the array [2, 4, 1, 3, 5] is 3.
Input: arr[] = [10, 2]
Output: -1
Explanation: There are less than three elements in the array, so the third largest element cannot be determined.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)*/
class Solution {
    int thirdLargest(int arr[]) {
        int max1=-1,max2=-1,max3=-1;
        
        for(int ele:arr)
        {
            if(max1 < ele)
            {
                max3=max2;
                max2=max1;
                max1=ele;
            }
            
           else if( ele > max2)
            
            {
                max3=max2;
                max2=ele;
            }
           else if(ele > max3)
            {
                max3=ele;
            }
        }
        return max3;
    }
}
