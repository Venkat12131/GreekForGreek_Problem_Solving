/*Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.

Example 1:

Input:
      4
    /   \
   2     9
k = 2 
Output: 4 */

class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
     ArrayList<Integer> res=new ArrayList<>();
     
        inorder(root,res);
        int n=res.size();
        return res.get(n-(K));
    }
    
    public void inorder(Node root, ArrayList<Integer> res)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,res);
        res.add(root.data);
        
        inorder(root.right,res);
    }
}