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
            System.out.print(" "+root.key);
            inorderTraverseRec(root.right);
        }
   }

    public void preOrderTraverse(){

        preOrderTraverseRec(root);
    }
    public void preOrderTraverseRec(Node root){

        if(root !=null){
            System.out.print(" "+root.key);
            preOrderTraverseRec(root.left);
            preOrderTraverseRec(root.right);
        }
    }

    public void postOrderTraverse(){

        postOrderTraverseRec(root);
    }
    public void postOrderTraverseRec(Node root){

        if(root !=null){
            postOrderTraverseRec(root.left);
            postOrderTraverseRec(root.right);
            System.out.print(" "+root.key);
        }
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(6);
        bst.insert(4);
        bst.insert(8);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);

        bst.inorderTraverse();
        System.out.println("\n-----------------------------------------");
        bst.preOrderTraverse();
        System.out.println("\n-----------------------------------------");
        bst.postOrderTraverse();
    }
}
//Inorder  -- 3 4 5 6 7 8 9
//PreOrder -- 6 4 3 5 8 7 9
//PostOrder-- 3 5 4 7 9 8 6