package sept20;

public class DoubleDimension {
    int[][] arr = null;

    public DoubleDimension(int rows, int cols) {
        arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // 1. insert
    public void insert(int value, int row, int col) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // 2. traverse
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }

                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    // 3. search
    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println(value + " is found at row " + i + ", col " + j);
                    return;
                }
            }
        }
        System.out.println(value + " is not found");
    }

    // 4. delete
    public void delete(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("The value at row " + row + ", col " + col + " has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        DoubleDimension doubleDimension = new DoubleDimension(3, 3);

        // test insert
        System.out.println("Insert:");
        doubleDimension.insert(10, 0, 0);
        doubleDimension.insert(9, 1, 1);
        doubleDimension.insert(8, 2, 2);
        doubleDimension.insert(7, 2, 2);

        // test traverse
        System.out.println("\nTraverse:");
        doubleDimension.traverse();

        // test search
        System.out.println("\nSearch:");
        doubleDimension.search(9);
        doubleDimension.search(13);

        // test delete
        System.out.println("\nDelete:");
        doubleDimension.delete(2, 2);
        doubleDimension.delete(0, 1);

        // final traverse
        System.out.println("\nTraverse:");
        doubleDimension.traverse();
    }
}

