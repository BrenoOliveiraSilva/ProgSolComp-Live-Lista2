import javax.swing.*;
import java.util.Scanner;

public class App21 {
    public static void main(String[] args) throws Exception {
        boolean validInput = false;
        int number = 0;
        while (!validInput) {
            number = Integer.parseInt(JOptionPane.showInputDialog(null,"Número", "Elevador", 3));
            if (number > 0) {
                validInput = true;
            } else {
                JOptionPane.showMessageDialog(null, "Tente novamente");
            }
        }

        for (int i = 1; i <= number; i++) {
            System.out.printf("Tabuada %d: ", i);
            for (int j = 1; j <= 10; j++) {
                int multiplicationTable = i * j;
                System.out.print(multiplicationTable + " ");
            }
            System.out.println();
        }
    }
}
