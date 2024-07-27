/*Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side. Return the right view as a list. 

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Examples :

Input:
       1
    /    \
   3      2
Output: 1 2
Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60 */

class Solution {
    // Function to return list containing elements of right view of binary tree.
    
    public void view(Node root,int level,ArrayList<Integer>leve,ArrayList<Integer> result)
    {
        if(root==null)
        {
            return ;
        }
        
        if(!leve.contains(level))
        {
            result.add(root.data);
            
            leve.add(level);
        }
        
        
        view(root.right,level+1,leve,result);
        view(root.left,level+1,leve,result);
    }
    
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        
        ArrayList<Integer>level=new ArrayList<>();
        result.add(root.data);
        
        level.add(0);
        
        view(root,0,level,result);
        
        
        return result;
    }
}