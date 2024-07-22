/*Given a binary tree. Find the size of its largest subtree which is a Binary Search Tree.
Note: Here Size equals the number of nodes in the subtree.

Examples :

Input:   1
        /  \
        4   4              
       / \ 
      6   8
Output: 1 
Explanation: There's no sub-tree with size greater than 1 which forms a BST. All the leaf Nodes are the BSTs with size equal to 1.*/
 
SOLUTION
class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
   static boolean isBST(Node head, int low, int high) {
        if (head == null)
            return true;
        
        if (head.data <= low || head.data >= high)
            return false;
        
        return isBST(head.left, low, head.data) && isBST(head.right, head.data, high);
    }

    
     
    static int getSize(Node root) {
        if (root == null)
            return 0;

        return 1 + getSize(root.left) + getSize(root.right);
        
    }
    static int largestBst(Node root)
    {
         if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        int ans = 0;
        q.add(root);
        
        while (!q.isEmpty()) {
            Node head = q.poll();

            if (isBST(head, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                ans = Math.max(ans, getSize(head));
            }

            if (head.left != null)
                q.add(head.left);
            if (head.right != null)
                q.add(head.right);
        }

        return ans;
    }
        
        
    
    
}