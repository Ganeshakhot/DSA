package Trees;

class BST {
    public Node root;

    public void insert(int key) {
        root = insert(root, key);
    }

    public Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key <= node.val) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }
        return node;
    }

    public Node search(int key) {
        return search(root, key);
    }

    public Node search(Node node, int key) {
        if (node == null || node.val == key) {
            return node;
        }
        if (key <= node.val) {
            return search(node.left, key);
        }
        return search(node.right, key);
    }



    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }



    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }
}

class BinarySearchTree {
    public static void main(String[] args) {
        BST BST = new BST();
        BST.insert(10);
        BST.insert(15);
        BST.insert(5);
        BST.insert(8);
        BST.insert(18);
        BST.insert(12);
        BST.insert(10);



        System.out.print("in order :");
        BST.inOrder(BST.root);
        System.out.println();

        System.out.print("pre order :");
        BST.preOrder(BST.root);
        System.out.println();

        System.out.print("post order");
        BST.postOrder(BST.root);
        System.out.println();

        search(BST, 12);
        search(BST, 9);
    }

    public static void search(BST BST, int key) {
        if (BST.search(key) != null) {
            System.out.println(key + " found");
        } else {
            System.out.println(key + " not found");
        }
    }
}