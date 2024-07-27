/*Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument. If no left view is possible, return an empty tree.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3




*/

class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
     ArrayList<Integer>node=new ArrayList<>();
     
     ArrayList<Integer>level=new ArrayList<>();
     
     if(root==null)
     {
         return node;
     }
     
     node.add(root.data);
     level.add(0);
     view(root,0,node,level);
     return node;
        
    }
    void view(Node root,int n,ArrayList<Integer>node,ArrayList<Integer>level)
    {
        if(root==null)
            return;
            
       if(!level.contains(n))
       {
           node.add(root.data);
           level.add(n);
       }
       
       view(root.left,n+1,node,level);
       
       view(root.right,n+1,node,level);
        
        
    }
}
