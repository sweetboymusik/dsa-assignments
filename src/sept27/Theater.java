package sept27;

public class Theater {
    // instance variables
    private Seat[][] seats;

    // constructors
    public Theater(int rows, int cols) {
        this.seats = new Seat[rows][cols];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                seats[i][j] = new Seat();
            }
        }
    }

    // getters and setters
    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    public int getRows(){
       return seats.length;
    }

    public int getCols(){
        return seats[0].length;
    }

    // methods
    public String reserveSeat(int row, int col) {
        try {
            if (seats[row][col].isReserved()) {
                return "Reserve failed: Seat is already reserved";
            } else {
                seats[row][col].setReserved(true);
                return "Reserve succeeded: Seat [" + row + "][" + col + "] has been reserved";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Reserve failed: Seat does not exist";
        }
    }

    public String cancelSeat(int row, int col) {
        try {
            if (!seats[row][col].isReserved()) {
                return "Cancel failed: Seat is not reserved";
            } else {
                seats[row][col].setReserved(false);
                return "Cancel succeeded: Seat [" + row + "][" + col + "] reservation has been cancelled";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Cancel failed: Seat does not exist";
        }
    }

    public void displaySeats(){
        System.out.println("Seating chart:");

        for (int i = 0; i < seats.length; i++) {
            System.out.print("     " + i);
        }

        for (int i = 0; i < seats.length; i++) {
            System.out.println();
            System.out.print(i + "   ");
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].isReserved()) {
                    System.out.print("RESD  ");
                } else {
                    System.out.print("free  ");
                }
            }
        }

        System.out.println();
    }
}
