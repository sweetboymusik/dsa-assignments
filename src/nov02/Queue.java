package nov02;

public class Queue<Animal> {
    private Node<Animal> front;
    private Node<Animal> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(Animal data) {
        Node<Animal> newNode = new Node<>(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public Animal dequeue() {
        if (front == null) {
            return null;
        }

        Animal data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        return data;
    }

    public Animal peek() {
        if (front == null) {
            return null;
        }

        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
