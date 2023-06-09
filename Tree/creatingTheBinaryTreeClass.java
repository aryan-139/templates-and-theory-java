//First we need to create a Node class, that represents the individual nodes of the binary tree 
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// next, we create the binary tree class
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // method to put in a new node in the binary tree
    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node currentNode, int data) {
        if (currentNode == null) {
            currentNode = new Node(data);
            return currentNode;
        }
        if (data < currentNode.data) {
            currentNode.left = insertNode(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = insertNode(currentNode.right, data);
        }
        return currentNode;
    }
}

// go ahead with the example usage of the binary tree
public class binaryTreeExample {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.root);

        // insert the nodes now, following a pre-order
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(7);

        // now we can perform whatever operations we want with the binary tree
        // .....

        printTree(tree.root);
    }

    public static void printTree(Node currentNode) {
        if (currentNode != null) {
            printTree(currentNode.left);
            System.out.println(currentNode.data + " ");
            printTree(currentNode.right);
        }
    }
}
