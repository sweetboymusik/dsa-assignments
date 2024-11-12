package nov12;

public class SumPositiveIntegers {
    public int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static void main(String[] args) {
        SumPositiveIntegers sum = new SumPositiveIntegers();
        System.out.println("Recursive sum of numbers up to 5: " + sum.sumRecursive(5));
    }
}