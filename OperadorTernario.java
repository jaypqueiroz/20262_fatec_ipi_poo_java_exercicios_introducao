public class OperadorTernario {
    static public void main(String args []){
        double nota = 4;
        //se a nota for pelo menos 6 a criatura está aprovada, caso contrário está reprovada
        //operador ternario é um if/else dentro de uma linha só
        System.out.println(nota >= 6 ? "Aprovado" : nota >= 4 ? "Exame final" : "Reprovado");
    }
}
