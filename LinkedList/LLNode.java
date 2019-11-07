public class LLNode {
    private int data;
    private LLNode next;

    public LLNode(int num) {
        data = num;
    }

    public void setData(int num) {
        data = num;
    }

    public void setNext(LLNode node) {
        next = node;
    }

    public int getData() {
        return data;
    }

    public LLNode getNext() {
        return next;
    }
}