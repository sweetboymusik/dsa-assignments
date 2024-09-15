package sept16;

import java.util.Scanner;

public class ComputeAvgTemp {
    public static double getAverageTemp(double[] temps) {
        double sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        return sum / temps.length;
    }

    public static int getAboveAverageTemp(double[] temps, double avgTemp) {
        int tempsAboveAverage = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > avgTemp) {
                tempsAboveAverage++;
            }
        }

        return tempsAboveAverage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. prompt user for number of temps
        System.out.print("Enter number of temperatures: ");
        int numTemps = scanner.nextInt();
        scanner.nextLine();

        // create temps array
        double[] temps = new double[numTemps];

        for (int i = 0; i < numTemps; i++) {
            // 2. prompt user to enter each temperature
            System.out.print("Enter number " + (i + 1) + ": ");

            // add input to the temps array
            temps[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        // 3. calculate average temp
        double avgTemp = ComputeAvgTemp.getAverageTemp(temps);
        System.out.println("Average temperature: " + avgTemp);

        // 4. get number of temps above average temp
        int numTempsAboveAverage = ComputeAvgTemp.getAboveAverageTemp(temps, avgTemp);
        System.out.println("Number of temperatures above average: " + numTempsAboveAverage);

    }
}
