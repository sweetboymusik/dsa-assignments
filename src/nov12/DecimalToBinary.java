package nov12;

public class DecimalToBinary {
    public String decimalToBinary(int n) {
        if (n <= 1) return Integer.toString(n);
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        DecimalToBinary converter = new DecimalToBinary();
        System.out.println("Binary of 10: " + converter.decimalToBinary(10));
    }
}