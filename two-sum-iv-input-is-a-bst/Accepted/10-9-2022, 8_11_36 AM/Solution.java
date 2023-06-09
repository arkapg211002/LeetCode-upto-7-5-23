// https://leetcode.com/problems/two-sum-iv-input-is-a-bst

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet <Integer> elements = new HashSet <>();
        return search(root, elements, k);
    }
    
    public boolean search(TreeNode root, HashSet <Integer> elements, int k){
        if(root == null) {
            return false;
        }
        if(elements.contains(k - root.val)) {
            return true;
        }
        elements.add(root.val);
        return search(root.right, elements, k) || search(root.left, elements, k);
    }
}