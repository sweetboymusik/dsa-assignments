package nov02;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        Dog dog1 = new Dog("Rosie");
        shelter.enqueue(dog1);
        System.out.println(dog1.getName() + " arrived at " + dog1.getArrivalTime());

        Cat cat1 = new Cat("Sherlock");
        shelter.enqueue(cat1);
        System.out.println(cat1.getName() + " arrived at " + cat1.getArrivalTime());

        Cat cat2 = new Cat("Watson");
        shelter.enqueue(cat2);
        System.out.println(cat2.getName() + " arrived at " + cat2.getArrivalTime());

        Dog dog2 = new Dog("Max");
        shelter.enqueue(dog2);
        System.out.println(dog2.getName() + " arrived at " + dog2.getArrivalTime());

        Cat cat3 = new Cat("Puss");
        shelter.enqueue(cat3);
        System.out.println(cat3.getName() + " arrived at " + cat3.getArrivalTime());

        Dog dog3 = new Dog("Toby");
        shelter.enqueue(dog3);
        System.out.println(dog3.getName() + " arrived at " + dog3.getArrivalTime());

        Dog dog4 = new Dog("Jack");
        shelter.enqueue(dog4);
        System.out.println(dog4.getName() + " arrived at " + dog4.getArrivalTime());

        Cat cat4 = new Cat("Jill");
        shelter.enqueue(cat4);
        System.out.println(cat4.getName() + " arrived at " + cat4.getArrivalTime());

        System.out.println();
        System.out.println("Animals at the shelter: " + shelter.getAnimalCount());
        System.out.println("Cats at the shelter: " + shelter.getCatCount());
        System.out.println("Dogs at the shelter: " + shelter.getDogCount());

        System.out.println();
        System.out.println("Adopting oldest animal: " + shelter.dequeueAny().getName());
        System.out.println("Adopting oldest cat: " + shelter.dequeueCat().getName());
        System.out.println("Adopting oldest dog: " + shelter.dequeueDog().getName());

        System.out.println();
        System.out.println("Cats at the shelter: " + shelter.getCatCount());
        System.out.println("Dogs at the shelter: " + shelter.getDogCount());
    }
}
