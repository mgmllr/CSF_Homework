public class IntLinkedList {
    IntListNode firstNode;
    IntListNode lastNode;

    public void insert(int value) {
        if(firstNode == null){
            firstNode = new IntListNode(value);
            lastNode = firstNode;
        } else {
            IntListNode newNode = new IntListNode(value);
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }
    }
    public void print() {
        System.out.println(firstNode.getNumber());
        IntListNode nextNode = firstNode.getNextNode();
        if(firstNode != lastNode) {
            while(nextNode.nextNode != null){
                System.out.println(nextNode.getNumber());
                nextNode = nextNode.getNextNode();
            }
        }
    }
}
