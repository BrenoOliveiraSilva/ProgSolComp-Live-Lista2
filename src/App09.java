import java.util.Scanner;

public class App09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Valor total a ser pago: R$ %.2f", finalValue(scanner));
    }

    private static double valueInput(Scanner scanner) {
        System.out.print("Valor da venda: R$ ");
        return scanner.nextDouble();
    }

    private static void menuText() {
        System.out.println("-----------------------MENU-----------------------");
        System.out.println("\n----------------FORMA DE PAGAMENTO----------------\n");
        System.out.println("1 - Venda a Vista               | Desconto de 10%");
        System.out.println("2 - Venda a Prazo 30 dias       | Desconto de 5%");
        System.out.println("3 - Venda a Prazo 60 dias       | Mesmo preço");
        System.out.println("4 - Venda a Prazo 90 dias       | Acréscimo de 5%");
        System.out.println("5 - Venda com Cartão de Débito  | Desconto de 8%");
        System.out.println("6 - Venda com Cartão de Crédito | Desconto de 7%");
        System.out.print("\nEscolha: ");
    }

    private static int optionInput(Scanner scanner) {
        return scanner.nextInt();
    }

    private static double finalValue(Scanner scanner) {
        double value = valueInput(scanner);
        int option;
        do {
            menuText();
            option = optionInput(scanner);
            switch (option) {
                case 1:
                    value *= 0.9;
                    break;

                case 2:
                    value *= 0.95;
                    break;

                case 3:
                    value *= 1;
                    break;

                case 4:
                    value *= 1.05;
                    break;

                case 5:
                    value *= 0.92;
                    break;

                case 6:
                    value *= 0.93;
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (option < 1 || option > 6);
        return value;
    }
}
