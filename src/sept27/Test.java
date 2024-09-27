package sept27;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Theater theater = new Theater(5, 5);

        Menu menu = new Menu(scanner, theater);
        menu.mainMenu();
    }
}
