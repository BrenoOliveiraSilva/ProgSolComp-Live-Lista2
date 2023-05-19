import java.util.Scanner;

public class App06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        conceptCheck(scanner);
    }

    private static double gradeInput(Scanner scanner) {
        double grade = scanner.nextDouble();
        return grade; 
    }

    private static void conceptCheck(Scanner scanner) {
        double grade = gradeInput(scanner);
        String concept = "";
        boolean validInput = false;
        while (!validInput) {
            if (grade < 0 || grade > 100) {
                System.out.println("Valor inválido");
                grade = gradeInput(scanner);
            } else {
                if (grade <= 49) {
                    concept = "Insuficiente";
                } else if (grade <= 64) {
                    concept = "Regular";
                } else if (grade <= 84) {
                    concept = "Bom";
                } else {
                    concept = "Ótimo";
                }
                validInput = true;
            }
        }
        System.out.printf("Nota conceito: %s", concept);
    }
}
