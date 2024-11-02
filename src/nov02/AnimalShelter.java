package nov02;

public class AnimalShelter {
    private final Queue<Dog> dogQueue;
    private final Queue<Cat> catQueue;

    public AnimalShelter() {
        dogQueue = new Queue<>();
        catQueue = new Queue<>();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogQueue.enqueue((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.enqueue((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) {
            return null;
        } else if (dogQueue.isEmpty()) {
            return catQueue.dequeue();
        } else if (catQueue.isEmpty()) {
            return dogQueue.dequeue();
        }

        Dog oldestDog = dogQueue.peek();
        Cat oldestCat = catQueue.peek();

        return (oldestDog.getArrivalTime() < oldestCat.getArrivalTime())
                ? dogQueue.dequeue() : catQueue.dequeue();
    }

    public Dog dequeueDog() {
        return dogQueue.dequeue();
    }

    public Cat dequeueCat() {
        return catQueue.dequeue();
    }

    public int getDogCount() {
        return dogQueue.size();
    }

    public int getCatCount() {
        return catQueue.size();
    }

    public int getAnimalCount() {
        return dogQueue.size() + catQueue.size();
    }

}
