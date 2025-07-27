/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int heightCheck(Node node) {
        if(node == null) return 0;
        
        int l = heightCheck(node.left);
        int r = heightCheck(node.right);
        
        return Math.max(l, r) + 1;
    }
    
    int height(Node node) {
        if(node == null) return 0;
        return Math.max(heightCheck(node.left), heightCheck(node.right));
    }
}