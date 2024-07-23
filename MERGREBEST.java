/*Given two BSTs, return elements of merged BSTs in sorted form.

Examples :

Input:
BST1:
       5
     /   \
    3     6
   / \
  2   4  
BST2:
        2
      /   \
     1     3
            \
             7
            /
           6
Output: 1 2 2 3 3 4 5 6 6 7
Explanation: After merging and sorting the two BST we get 1 2 2 3 3 4 5 6 6 7.
Expected Time Complexity: O(m+n)
Expected Auxiliary Space: O(Height of BST1 + Height of BST2 + m + n)
*/

class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public void inOrder(Node root,ArrayList<Integer>tree)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left,tree);
        tree.add(root.data);
        inOrder(root.right,tree);
        
    }
    
    public ArrayList<Integer>sort(ArrayList<Integer>tree1,int size1,ArrayList<Integer>tree2,int size2){
        ArrayList<Integer>result=new ArrayList<>();
        int i=0,j=0;
        
        while(i<size1 && j<size2)
        {
            int data1=tree1.get(i);
            int data2=tree2.get(j);
            
            if(data1 < data2)
            {
                result.add(data1);
                i++;
            }
            else{
                result.add(data2);
                j++;
            }
        }
        
        while(i<size1)
        {
            result.add(tree1.get(i));
            i++;
            
        }
        while(j<size2)
        {
            result.add(tree2.get(j));
            j++;
        }
        
        return result;
    }
    public List<Integer> merge(Node root1, Node root2) {
        
     ArrayList<Integer>tree1=new ArrayList<>();
     ArrayList<Integer>tree2=new ArrayList<>();
     
     inOrder(root1,tree1);
     inOrder(root2,tree2);
     
     return sort(tree1,tree1.size(),tree2,tree2.size());
     
     
    }
}

