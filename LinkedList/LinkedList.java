public class LinkedList {
    private LLNode front;
    private LLNode current;
    private LLNode back;

    public LinkedList() {
    }

    public void setFront(LLNode node) {
        front = node;
    }

    public void setBack(LLNode node) {
        back = node;
    }

    public void setCurrent(LLNode node) {
        current = node;
    }

    public int getFront() {
        return front.getData();
    }

    public int getBack() {
        return back.getData();
    }

    public int getCurrent() {
        return current.getData();
    }
}