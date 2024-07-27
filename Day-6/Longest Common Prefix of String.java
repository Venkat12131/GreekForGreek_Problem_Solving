/*Given an array of strings arr. Return the longest common prefix among all strings present in the array. If there's no prefix common in all the strings, return "-1".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: gee
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: -1
Explanation: There's no common prefix in the given strings. */

class Solution {
    public String longestCommonPrefix(String arr[]) {
       
       if (arr == null || arr.length == 0) {
            return "-1";
        }
        
        String s = arr[0];
        String ans = "-1";

       
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            boolean isCommon = true;

           
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].length() < i || !arr[j].substring(0, i).equals(prefix)) {
                    isCommon = false;
                    break;
                }
            }

            
            if (isCommon) {
                ans = prefix;
            } else {
                break; 
            }
        }

        return ans;
    }
}