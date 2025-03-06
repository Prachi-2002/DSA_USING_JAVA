package Trees.TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;

// * Tree Traversals
// Traversal means visiting each node in a particular order. The main types of tree traversals are:

// 1️⃣ Depth-First Traversal (DFS)
// Preorder (Root → Left → Right)
// Inorder (Left → Root → Right)
// Postorder (Left → Right → Root)
// 2️⃣ Breadth-First Traversal (BFS)
// Level Order (Left to Right, level by level)


class TreeNode{

    TreeNode left;
    TreeNode right;
    int data;

    TreeNode (TreeNode left, TreeNode right, int data){
        this.left = left;
        this.right = right;
        this.data =  data;
    }

    TreeNode (int data){
        this.left = null;
        this.right = null;
        this.data =  data;
    }
}

class BinaryTreeTraversal {

    TreeNode root;
    static void preOrderTraversal(TreeNode root){

        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    static void inOrderTraversal(TreeNode root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    static void postOrderTraversal(TreeNode root){

        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrderTraversal(TreeNode root){

        if(root == null) return;

        Queue<TreeNode> queue =  new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();

            System.out.print(temp.data + " ");

            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
    }
}

public class TreeTraversal {
    
public static void main(String[] args) {
    
    BinaryTreeTraversal tree =  new BinaryTreeTraversal();

    // Creating a sample tree
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(5);
    tree.root.right.left = new TreeNode(6);
    tree.root.right.right = new TreeNode(7);

    System.out.println("Level Order traversal:");
    tree.levelOrderTraversal(tree.root); // Output: 1 2 3 4 5 6 7

    System.out.println("Preorder traversal:");
    tree.preOrderTraversal(tree.root); // Output: 1 2 4 5 3 6 7
    
    System.out.println("\nInorder traversal:");
    tree.inOrderTraversal(tree.root); // Output: 4 2 5 1 6 3 7

    System.out.println("\nPostorder traversal:");
    tree.postOrderTraversal(tree.root); // Output: 4 5 2 6 7 3 1
}

}
