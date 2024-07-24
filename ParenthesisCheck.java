/*Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.
Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.
Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.*/
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character>stack=new Stack<>();
        
        for(char c:x.toCharArray())
        {
            if(c=='{' || c=='[' || c=='(')
            {
                stack.add(c);
            }
            if(c==')' || c=='}'|| c==']')
            {
                if(!stack.isEmpty())
                {
                    char ch=stack.pop();
                    if(ch=='(' && c==')' || ch=='[' && c==']' || ch=='{' && c=='}')
                    {
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
