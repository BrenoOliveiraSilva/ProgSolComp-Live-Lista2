import java.util.Scanner;

public class App01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(higherNumberVerification(scanner));
    }

    private static double[] numbersInput(Scanner scanner) {
        double numbers[] = new double[2];
        numbers[0] = scanner.nextDouble();
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    private static double higherNumberVerification(Scanner scanner) {
        double numbers[] = numbersInput(scanner);
        if (numbers[0] > numbers[1]) {
            return numbers[0];
        } else {
            return numbers[1];
        }
    }
}
