public class Node {
    char letter;
    Node left;
    Node right;

    public Node () {
        letter = '\0';
        right = null;
        left = null;
    }
    
    public Node(char a) {
        letter = a;
        right = null;
        left = null;
    }
    
    public void setChar(char a) {
        letter = a;
    }
    
    public char getLetter() {
        return letter;
    }
    
    public void setLeft(Node n) {
        left = n;
    }
    
    public Node getLeft() {
        return left;
    }
    
    public void setRight(Node n) {
        right = n;
    }
    
    public Node getRight() {
        return right;
    }
}