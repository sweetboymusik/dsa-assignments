package nov02;

public abstract class Animal {
    private final String name;
    private final long arrivalTime;

    public Animal(String name) {
        this.name = name;
        this.arrivalTime = System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public abstract String getType();
}

