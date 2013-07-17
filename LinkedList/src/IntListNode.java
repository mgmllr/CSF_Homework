
public class IntListNode {
    int value;
    IntListNode nextNode;

    public IntListNode(int value) {
        this.value = value;
        this.nextNode = null;
    }

    public IntListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntListNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getNumber() {
        return value;
    }

    public void setNumber(int number) {
        this.value = number;
    }
}
