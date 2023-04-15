package Trees;


public class BinaryTree {
    Node root;
    //inserting data into the binary tree
    BinaryTree(int key) {
        root = new Node(key);
    }

    //set root NULL when the binary tree is created for the first time
    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        //creating a new instance of Binary Tree
        BinaryTree tree = new BinaryTree();

        //inserting into the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
    }
}
