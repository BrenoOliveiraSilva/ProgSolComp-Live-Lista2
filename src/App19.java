import java.util.Scanner;

public class App19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tempo necessário para o gás passar de 1000 cm³ " + getSeconds(scanner) + " segundos");
    }

    private static double getSeconds(Scanner scanner) {
        System.out.print("Volume do gás (cm³): ");
        double gas = scanner.nextDouble();
        int seconds = 0;
        while (gas < 1000) {
            seconds ++;
            gas *= 2;
        }
        return seconds;
    }
}
