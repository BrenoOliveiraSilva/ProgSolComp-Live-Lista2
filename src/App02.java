import java.util.Arrays;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        numbersAscending(scanner);
    }

    private static double[] numbersInput(Scanner scanner) {
        double numbers[] = new double[3];
        numbers[0] = scanner.nextDouble();
        numbers[1] = scanner.nextDouble();
        numbers[2] = scanner.nextDouble();
        return numbers;
    }

    private static void numbersAscending(Scanner scanner) {
        double numbers[] = numbersInput(scanner);
        Arrays.sort(numbers);
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}
