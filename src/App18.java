public class App18 {
    public static void main(String[] args) throws Exception {
        System.out.println(getFactorial(0));
        System.out.println(getFactorial(3));
        System.out.println(getFactorial(6));
    }

    private static double getFactorial(double number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
