package nov02;

class Node<Animal> {
    Animal data;
    Node<Animal> next;

    public Node(Animal data) {
        this.data = data;
        this.next = null;
    }
}