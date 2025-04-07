package Trees.TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    static void DFSTraversal (TreeNode root){

        Stack<TreeNode> st = new Stack<>();

        if(root == null) return;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();

            System.out.print(temp.data + " ");

            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        }
    }

    static void DFSRecursively(TreeNode root){

        if(root == null) return ;

        System.out.print(root.data + " ");
        DFSRecursively(root.left);
        DFSRecursively(root.right);
    }

    // ----- Issue with this method is as we define the sum variable if we call this function multiple times it will hold pevious value
   /*  static int sum = 0;
    static int sumOfLeafNodes(TreeNode root){
        if( root == null) return 0;
        sumOfLeafNodes(root.left);
        sumOfLeafNodes(root.right);
        if(root.left == null && root.right == null){
            sum += root.data;
        }
        return sum;
    }

    */

    static int sumOfLeafNodes(TreeNode root){

        if(root == null) return 0;

        if(root.left == null && root.right == null) return root.data;

        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);

    }

    static int maximumInTree(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE; // Base case
    
        int leftMax = maximumInTree(root.left);
        int rightMax = maximumInTree(root.right);
    
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    static void leftViewOfTree (TreeNode root){

        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i< size;i++){
                TreeNode poppedNode = q.poll();
                if(i==0)
                    System.out.print(poppedNode.data + " __ ");
                if(poppedNode.left != null) q.add(poppedNode.left);
                if(poppedNode.right != null) q.add(poppedNode.right);
            }
        }
    }

    static int heightOfBinaryTree(TreeNode root){

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return 0;

        int height = 0;

        q.add(root);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();

            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            if(temp.left != null || temp.right != null){

                height++;
            }
        }

        return height;
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

    System.out.println("\n DFS order traversal:");
    tree.DFSTraversal(tree.root);

    System.out.println("\n DFS order traversal Recursively:");
    tree.DFSTraversal(tree.root);

    System.out.println("\n Sum of leaf nodes:");
    System.out.println(tree.sumOfLeafNodes(tree.root));

    System.out.println("\n Height of Binary treee:");
    System.out.println(tree.heightOfBinaryTree(tree.root));

    System.out.println("\n Maximum val in Binary treee:");
    System.out.println(tree.maximumInTree(tree.root));

    System.out.println("\n Left view of Binary treee:");
    tree.leftViewOfTree(tree.root);
}

}
