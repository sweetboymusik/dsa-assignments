package sept27;

public class Seat {
    private boolean reserved;

    public Seat() {
        this.reserved = false;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
