//joaoPedrodeQueirozLeite // camel case para metodos variaveis, e afins (nao classes)
//JoaoPedroDeQueirozLeite // camel case para classes
//joao_pedro_de_queiroz_leite // snake case
//joao-pedro-de-queiroz-lete // kebab case
import javax.swing.JOptionPane;

public class Exercicio8 {
    static public void main(String args []){
        //classes empacotadoras (wrapper)
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um inteiro")
        );
        StringBuilder tabuada = new StringBuilder();
        for (int i = 1; i <= 10; i++){
            //numero * 
            tabuada
                .append(numero)
                .append(" X ")
                .append(i)
                .append(" = ")
                .append(numero * i)
                .append("\n");
        }
        javax.swing.JOptionPane.showMessageDialog(
            null,
            tabuada.toString(),
            "Tabuada",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
