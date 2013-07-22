import java.util.LinkedList;


public class IntBST {
    private IntNode rootNode;

    public void printTree() {
        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(rootNode);
        System.out.print("BFS of BST:" );

        while(!queue.isEmpty()) {
            IntNode node = queue.remove();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null)
                queue.add(node.getLeftChild());
            if (node.getRightChild() != null)
                queue.add(node.getRightChild());
        }
    }

    public void insertValue(int value) {
        IntNode newNode = new IntNode(value);
        if(rootNode == null) {
            rootNode = newNode;
        } else {
            IntNode currentNode = rootNode;
            while(true) {
                if(newNode.getValue() < currentNode.getValue()) {
                    if(currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getLeftChild();
                    }
                } else if(newNode.getValue() > currentNode.getValue()) {
                    if(currentNode.getRightChild() == null) {
                        currentNode.setRightChild(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getRightChild();
                    }
                }
            }
        }
    }

    public boolean search(int value) {
        if(value == rootNode.getValue()) {
            return true;
        } else {
            IntNode node = rootNode;
            while(true) {
                if(value < node.getValue()) {
                    if(value == node.getLeftChild().getValue()){
                        return true;
                    } else {
                        node = node.getLeftChild();
                    }
                } else if(value > node.getValue()) {
                    if(value == node.getRightChild().getValue()) {
                        return true;
                    } else {
                        node = node.getRightChild();
                    }
                }
                return false;
            }
        }
    }

    public void remove(int value) {
        // TODO: Optional Challenge HW Question for next Monday
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R

    }
}
