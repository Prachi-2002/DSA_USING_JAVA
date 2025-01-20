package Trees.BinaryTrees;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.right=  null;
        this.left=  null;
    }

    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right =  right;
    }
}

class InnerBinaryTreeImplementation {

    Node root;

    void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node poppedElement = q.remove();
            System.out.print(poppedElement.data + " ");
            if(poppedElement.left != null){
                q.add(poppedElement.left);
            }
            if(poppedElement.right != null){
                q.add(poppedElement.right);
            }

        }
        System.out.println();

    }

    void DFS(Node root){
        Stack <Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node poppedElement  = st.pop();
            System.out.print(poppedElement.data+" ");
            if(poppedElement.right != null)
                st.push(poppedElement.right);
            if(poppedElement.left != null)
                st.push(poppedElement.left);      
        }
        System.out.println();

    }

    void DFSRecursively(Node root){

        if (root == null) return;
        System.out.print(root.data + " ");
        DFSRecursively(root.left);
        DFSRecursively(root.right);
        System.out.println();

    }
    
}
public class BinaryTreeImplementation {

    public static void main(String[] args) {
        InnerBinaryTreeImplementation bt = new InnerBinaryTreeImplementation();

bt.root = new Node(4);

bt.root.left = new Node(7);

bt.root.right = new Node(9);

bt.root.left.left = new Node(0);

bt.root.left.right = new Node(12);

bt.root.right.left = new Node(13);

bt.root.right.right = new Node(18);
    }
}