import javax.swing.*;

public class App20 {
    public static void main(String[] args) throws Exception {
        double maximumElevatorLoad = Double.parseDouble(JOptionPane.showInputDialog(null,"Carga (MAX)", "Elevador", 3));
        int maximumNumberOfPeople = Integer.parseInt(JOptionPane.showInputDialog(null,"Pessoas (MAX)", "Elevador", 3));

        double elevatorLoad = 0;
        int numberOfPeople = 0;

        do  {
            numberOfPeople ++;
            elevatorLoad += Double.parseDouble(JOptionPane.showInputDialog(null, numberOfPeople + "º Pessoa ", "Elevador", 3));
        } while (numberOfPeople < maximumNumberOfPeople && elevatorLoad < maximumElevatorLoad);

        System.out.println("Carga Total: " + elevatorLoad + "/" + maximumElevatorLoad);
        System.out.println("Total de Pessoas: " + numberOfPeople + "/" + maximumNumberOfPeople);
    }
}
