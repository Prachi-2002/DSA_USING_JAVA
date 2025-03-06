package Trees.TreeTraversal;

class TreeNode {
    TreeNode left, right;
    int data;

    TreeNode (int data){
        this.left =  null;
        this.right =  null;
        this.data = data;
    }

    TreeNode (TreeNode left , TreeNode right, int data){
        this.left =  left;
        this.right =  right;
        this.data =  data;
    }
}

class BST {

    TreeNode root;

    static TreeNode insertInBinarySearchTree(TreeNode root, int data){

        if(root == null) return  new TreeNode(data);

        if(data < root.data){
            root.left = insertInBinarySearchTree(root.left, data);
        }
        else if (data >  root.data){
            root.right =  insertInBinarySearchTree(root.right, data);
        }

        return root;
    }

    static boolean search(TreeNode root, int value){

        if(root == null) return false;

        if(value == root.data){
            return true;
        }
        else if (value < root.data){
            return search(root.left, value);
        }else {
            return search(root.right, value);
        }
    }

    static void inOrderTraversal(TreeNode root){

        if(root == null) return;

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    } 

}
public class BinarySearchTree {
    
    public static void main(String[] args) {
        
        BST tree = new BST();
        tree.root = tree.insertInBinarySearchTree(tree.root, 50);
        tree.insertInBinarySearchTree(tree.root, 30);
        tree.insertInBinarySearchTree(tree.root, 70);
        tree.insertInBinarySearchTree(tree.root, 20);
        tree.insertInBinarySearchTree(tree.root, 40);
        tree.insertInBinarySearchTree(tree.root, 60);
        tree.insertInBinarySearchTree(tree.root, 80);

    
        System.out.println("Inorder traversal of BST:");
        tree.inOrderTraversal(tree.root); // Output: 20 30 40 50 60 70 80
        System.out.println();
        System.out.println("Search 30: " + tree.search(tree.root, 30)); // true
        System.out.println("Search 100: " + tree.search(tree.root, 100)); // false
    }
}
