public class BinaryTree {
    Node root; 
    private Node current;
  
    public BinaryTree() {  
        root = null; 
        current = null;
    } 
    
    public void setRoot(Node n) {
        root = n;
    }
    
    public Node getRoot() {
        return root;
    }
    
    public void setCurrent(Node n) {
        current = n;
    }
    
    public Node getCurrent() {
        return current;
    }
  
    // pair of recursive methods to find an empty spot in the tree
    public void insert(char a) { 
       root = insertRec(root, a); 
    } 
    
    public Node insertRec(Node root, char a) { 
        if (root == null) {     // creates new node if empty
            root = new Node(a); 
            return root; 
        } 
  
        if (a < root.letter) root.left = insertRec(root.left, a); 
        else if (a > root.letter) root.right = insertRec(root.right, a);  
        return root; 
    } 
  
    // pair of recursive methods to print the tree in alphabetical order
    public void inorder()  { 
       inorderRec(root); 
    } 
   
    public void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.letter); 
            inorderRec(root.right); 
        } 
    } 
    
    public void search(Node root, char a) { 
        if (root == null) {
            System.out.println("Not found");
        } else if (root.letter == a) {
            System.out.println(a + " found in tree");
        } else if (root.letter > a) search(root.left, a); 
        else search(root.right, a); 
    }
}
