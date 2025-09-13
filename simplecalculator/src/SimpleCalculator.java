public class SimpleCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero not allowed.");
            return 0;
        }
        return a / b;

    }

    public static void main(String[] args) {
        double value1 = 10.5;
        double value2 = 2.5;

        System.out.println(value1 + " + " + value2 + " = " + add(value1, value2));
        System.out.println(value1 + " - " + value2 + " = " + subtract(value1, value2));
        System.out.println(value1 + " * " + value2 + " = " + multiply(value1, value2));
        System.out.println(value1 + " / " + value2 + " = " + divide(value1, value2));
    }
}
