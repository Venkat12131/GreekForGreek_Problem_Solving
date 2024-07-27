/*Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i*/


class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        
        
          String s="";
    String ans="";
    for(int i=S.length()-1;i>-1;i--){
        if(S.charAt(i)=='.'){
            ans+=s;
            ans+='.';
            s="";
        }
        else if(S.charAt(i)!='.') s=S.charAt(i)+s; 
    }
    return ans+s;
    }
}