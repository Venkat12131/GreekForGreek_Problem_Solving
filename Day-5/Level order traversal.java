/*Given a root of a binary tree with n nodes, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.

Example 1:

Input:
    1
  /   \ 
 3     2
Output:
1 3 2 */

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {       ArrayList<Integer>res=new ArrayList<>();
            Queue<Node>q=new LinkedList<>();
            
            q.add(root);
            
            while(!q.isEmpty())
            {
                Node curr=q.poll();
                
                res.add(curr.data);
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            
            return res;
    }
}