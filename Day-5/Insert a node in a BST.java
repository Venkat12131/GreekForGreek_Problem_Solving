/*Given a BST and a key k. If k is not present in the BST, Insert a new Node with a value equal to k into the BST. If k is already present in the BST, don't modify the BST. Return the root of the modified BST after inserting k. 

Note: The generated output contains the inorder traversal of the modified tree.

Examples :

Input: k = 4
     2
   /   \   
  1     3
Output: 1 2 3 4
Explanation: After inserting the node 4 Inorder traversal will be 1 2 3 4.*/

class Solution {
    // Function to insert a node in a BST.
    
    Node insert(Node root, int Key) {
        // your code here
        if(root == null){
            return new Node(Key);
        }
        
        if(Key>root.data){
            root.right = insert(root.right, Key);
        }else if(Key<root.data){
            root.left = insert(root.left, Key);
        }
        return root;

    }
}