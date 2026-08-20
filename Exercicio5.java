import javax.swing.JOptionPane;
public class Exercicio5 {
        public static void main (String args []){
            // float (4 bytes), double (8 bytes)
            float media = Float.parseFloat(
                JOptionPane.showInputDialog("Digite  a media")
            );
            String situacao;
            if(media >= 6)
                situacao = "aprovado";
            else if (media >= 4)
                situacao = "recuperacao";
            else
                situacao = "reprovado";
            JOptionPane.showInputDialog(
                null,
                "o aluno esta: " + situacao
            );
            
        }

}