/**
* Program: Binary Search Tree
* Developer: Justin Shull
* Date: 11/10/19
* Purpose: Create a binary search tree that stores characters in each node
*/
public class BinarySearchTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // test searching an empty tree
        tree.search(tree.root, 'z'); 
        // fill the tree
        tree.insert('r');
        tree.insert('a');
        tree.insert('z');
        tree.insert('s');
        tree.insert('t');
        // search values inserted into tree
        tree.search(tree.root, 'a');
        tree.search(tree.root, 'r');
        tree.search(tree.root, 'z');
        // test searching for values not in tree
        tree.search(tree.root, 'h');
        tree.search(tree.root, 'b');
        // print ordered tree
        tree.inorder();
        
    }
    
}
