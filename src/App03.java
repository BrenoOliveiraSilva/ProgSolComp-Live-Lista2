import java.util.Scanner;

public class App03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        checkMultiple(scanner);
    }

    private static double[] numbersInput(Scanner scanner) {
        double numbers[] = new double[2];
        numbers[0] = scanner.nextDouble();
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    private static void checkMultiple(Scanner scanner) {
        double numbers[] = numbersInput(scanner);
        if (numbers[0] % numbers[1] == 0 || numbers[1] % numbers[0] == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
