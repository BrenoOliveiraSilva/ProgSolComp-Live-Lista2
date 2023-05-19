import java.util.Scanner;

public class App16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double number = -1;
        while (number < 0){
            System.out.print("Digite um número: ");
            number = setNumber(scanner);
        }
    }

    private static double setNumber(Scanner scanner) {
        double number;
        number = scanner.nextDouble();
        return number;
    }
}
