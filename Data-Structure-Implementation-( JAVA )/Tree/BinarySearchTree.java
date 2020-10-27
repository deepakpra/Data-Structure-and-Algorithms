// Implementaion of Binary Search Tree 

class Bst {

    // Class to create node of tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // root node initially points to null
    Node root = null;

    // Method to call insretRec()
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive Method to insert element in tree Recursive
    Node insertRec(Node currentNode, int data) {

        if (currentNode == null) {
            currentNode = new Node(data);
            return currentNode;
        } else {
            if (data > currentNode.data) {
                // Go right
                currentNode.right = insertRec(currentNode.right, data);
            } else if (data < currentNode.data) {
                // Go left
                currentNode.left = insertRec(currentNode.left, data);
            }
        }
        return currentNode;
    }

    // Method to call inorderRec()
    void inorder() {
        inorderRec(root);
    }

    // Recursive Method for inorder traversal of BST (Inorder traversal of BST
    // always give
    // output in sorted order )
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    // Method to call searchRec()
    void search(int data) {
        System.out.println(searchRec(root, data));
    }

    // Method to search if a particular data/key is present in BST or not
    boolean searchRec(Node root, int data) {
        if (root != null) {
            if (root.data == data) {
                return true;
            }
            if (data > root.data) {
                // go right
                return searchRec(root.right, data);
            } else if (data < root.data) {
                return searchRec(root.left, data);
            }
        }
        return false;
    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        Bst myBst = new Bst();

        myBst.insert(445);
        myBst.insert(34);
        myBst.insert(234);
        myBst.insert(15);
        myBst.insert(78);
        myBst.insert(89);

        myBst.search(99);

        myBst.inorder();

    }
}