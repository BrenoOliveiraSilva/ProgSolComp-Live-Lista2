import java.util.Scanner;

public class App05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        dataVisualization(scanner);
    }

    private static String nameInput(Scanner scanner) {
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        return name;
    }

    private static String surnameInput(Scanner scanner) {
        System.out.print("Sobrenome: ");
        String surname = scanner.nextLine();
        return surname;
    }

    private static int ageInput(Scanner scanner) {
        System.out.print("Idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    private static String birthplaceInput(Scanner scanner) {
        System.out.print("Naturalidade: ");
        String birthplace = scanner.nextLine();
        return birthplace;
    }

    private static char optionInput(Scanner scanner) {
        System.out.print("Deseja visualizar dados completos? [S] ou [N]: ");
        char option = scanner.nextLine().toUpperCase().charAt(0);
        return option;
    }

    private static void dataVisualization(Scanner scanner) {
        boolean validInput = false;

        String name = nameInput(scanner);
        String surname = surnameInput(scanner);
        int age = ageInput(scanner);
        String birthplace = birthplaceInput(scanner);
        char option = optionInput(scanner);

        while (!validInput) {
            if (option == 'S') {
                System.out.printf("\nNome: %s %s", name, surname);
                System.out.printf("\nIdade: %d anos", age);
                System.out.printf("\nNaturalidade: %s", birthplace);
                validInput = true;
            } else if (option == 'N') {
                System.out.printf("\nNome: %s", name);
                System.out.printf("\nIdade: %d anos", age);
                validInput = true;
            } else {
                System.out.println("Digitação errada. Tente Novamente");
                option = optionInput(scanner);
            }
        }
    }
}
