//// Implementaion of BFS and DFS on Binary Search Tree


import java.util.*;

public class TreeBFS {

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

    //Method to Breadth First Search
    void bfs() {
        Queue<Node> q = new LinkedList<>();
        if(root != null) {
            q.add(root);
        }
        System.out.print("BFS: ");
        // Iterate untill queue is not empty
        while(!q.isEmpty()) {
           Node current = q.remove();
           System.out.print(current.data+" ");
           if(current.left != null) {
               q.add(current.left);
           }
           if(current.right != null) {
               q.add(current.right);
           }
        }
         

    }

    // Method to call preOrderRec()
    void preOrderDFS() {
        System.out.println();
        System.out.print("PreOrderDFS: ");
        preOrderRec(root);
    }

    // Recursive Method to print BST data in PreOrder
    void preOrderRec(Node root) {
        if(root != null) {
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }


    //// Method to call inOrderRec()
    void inOrderDFS() {
        System.out.println();
        System.out.print("inOrderDFS: ");
        inOrderRec(root);
    }

    // Recursive Method to print BST data in InOrder
    void inOrderRec(Node root) {
        if(root != null) {
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }


    // Method to call postOrderRec()
    void postOrderDFS() {
        System.out.println();
        System.out.print("PostOrderDFS: ");
        postOrderRec(root);
    }

    // Recursive Method to print BST data in PostOrder
    void postOrderRec(Node root) {
        if(root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        TreeBFS myBst = new TreeBFS();
        
        myBst.insert(89);
        myBst.insert(78);
        myBst.insert(234);
        myBst.insert(34);
        myBst.insert(445);
        myBst.insert(15);

        myBst.bfs();
        myBst.preOrderDFS();
        myBst.inOrderDFS();
        myBst.postOrderDFS();
    }

}