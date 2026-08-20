import javax.swing.JOptionPane;
public class Exercicio1{
    static public void main (String args []){
        String entrada = 
        JOptionPane.showInputDialog("Digite temp em celsius");
        //classe empacotadora (wrapper)
        double celsius = Double.parseDouble (entrada);
        double fahrenheit = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(
            null,
            String.format("Temp em fehrenheit: %.2f", fahrenheit)
        );
    }
}