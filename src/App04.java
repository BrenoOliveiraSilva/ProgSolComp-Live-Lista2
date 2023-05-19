import java.util.Scanner;

public class App04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        checkMultiple(scanner);
    }

    private static int numberInput(Scanner scanner) {
        int number = scanner.nextInt();
        return number; 
    }

    private static void checkMultiple(Scanner scanner) {
        int number = numberInput(scanner);
        String oddEven;
        String sign;

        if (number % 2 == 0) {
            oddEven = "Par";
        } else {
            oddEven = "Impar";
        }

        if (number < 0) {
            sign = "Negativo";
        } else if (number > 0) {
            sign = "Positivo";
        } else {
            sign = "Neutro";
        }

        System.out.printf("O número %d é %s e %s", number, oddEven, sign);
    }
}
