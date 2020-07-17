package edu.dsa.bst;

public class BinarySearchTree {

    class Node{
        int key;
        Node left, right;

       public Node(int data){
            key=data;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree(){
        root=null;
    }

   public void insert(int key){
        root= insertRecursive(root, key);
   }

   public Node insertRecursive(Node root, int key){

        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left= insertRecursive(root.left, key);
        } else if (key > root.key){
            root.right = insertRecursive(root.right,key);
        }
        return root;
   }

   public void inorderTraverse(){

        inorderTraverseRec(root);
   }
   public void inorderTraverseRec(Node root){

        if(root !=null){
            inorderTraverseRec(root.left);
            System.out.println("key : "+root.key);
            inorderTraverseRec(root.right);
        }
   }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(6);
        bst.insert(8);

        bst.inorderTraverse();
    }
}
