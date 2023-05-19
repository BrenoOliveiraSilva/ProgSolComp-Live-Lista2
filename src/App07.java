import java.util.Scanner;

public class App07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        dailyRate(scanner);
    }

    private static int daysInput(Scanner scanner) {
        int days = scanner.nextInt();
        return days; 
    }

    private static void dailyRate(Scanner scanner) {
        int days = daysInput(scanner);
        double hostingValue = 60;
        boolean validInput = false;
        while (!validInput) {
            if (days < 1) {
                System.out.println("Valor inválido");
                days = daysInput(scanner);
            } else {
                hostingValue *= days;
                validInput = true;
                if (days > 15) {
                    hostingValue += days * 5.5;
                } else if (days == 15) {
                    hostingValue += days * 6;
                } else {
                    hostingValue += days * 8;
                }
            }
        }
        System.out.printf("Valor total hospedagem: %s", hostingValue);
    }
}
