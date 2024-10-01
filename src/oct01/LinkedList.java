package oct01;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Create a linked List
    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert into a linked list
    //0. if linked list doesn't exist then create it
    //1. Inserting at the begining
    //2. Inserting at the ending
    //3. Insert anywhere in the LL
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;

    }

    //Traverse a Linked List
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //Search for a Node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print(" Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println(" Node not found");
        return false;
    }

    //Deleting a Node from a single List
    // 0. if link doesn't exist
    // 1. if deleting at the beginning
    // 2. if deleting at the ending
    // 3. if deleting anywhere in the list
    public void deleteNode(int nodeValue) {
        // 0. if link doesn't exist
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        }

        // 1. if deleting at the beginning
        if (head.value == nodeValue) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            size--;
            return;
        }

        // 2. if deleting at the end
        if (tail != null && tail.value == nodeValue) {
            if (head.next == null) {
                return;
            }

            Node prevNode = head;
            while (prevNode.next != tail) {
                prevNode = prevNode.next;
            }

            prevNode.next = null;
            tail = prevNode;
            size--;
            return;
        }

        // 3. if deleting anywhere
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null && currentNode.value != nodeValue) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            System.out.println("Node not found");
            return;
        }

        prevNode.next = currentNode.next;
        size--;
    }
}
