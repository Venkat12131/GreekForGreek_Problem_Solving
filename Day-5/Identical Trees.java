/*Given two binary trees, the task is to find if both of them are identical or not.
Note: You need to return true or false, the printing is done by the driver code.

Example 1:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: 
Yes
Explanation: 
There are two trees both having 3 nodes and 2 edges, both trees are identical having the root as 1, left child of 1 is 2 and right child of 1 is 3.*/
class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	   if(root1==null && root2==null)
	   {
	       return true;
	   }
	   
	   if(root1==null && root2!=null || root1!=null && root2==null)
	   {
	       return false;
	   }
	   
	   
	   if(root1.data!=root2.data)
	   {
	       return false;
	   }
	   
	   
	   return isIdentical(root1.left,root2.left)&& isIdentical(root1.right,root2.right);
	}
	
}