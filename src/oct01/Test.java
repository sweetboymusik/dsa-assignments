package oct01;

public class Test {
    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        sda.insertInLinkedList(1, 0);
        sda.insertInLinkedList(2, 1);
        sda.insertInLinkedList(3, 2);
        sda.insertInLinkedList(4, 3);
        sda.insertInLinkedList(5, 4);
        sda.insertInLinkedList(6, 5);

        sda.traverseLinkedList();
        sda.searchNode(8);

        // invalid delete
        sda.deleteNode(8);
        sda.traverseLinkedList();

        // delete tail
        sda.deleteNode(6);
        sda.traverseLinkedList();

        // delete head
        sda.deleteNode(1);
        sda.traverseLinkedList();

        // delete any
        sda.deleteNode(3);
        sda.traverseLinkedList();
    }
}
