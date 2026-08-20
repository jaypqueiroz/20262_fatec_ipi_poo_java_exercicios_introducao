    import java.util.Scanner;
    public class Exercicio2{
        public static void main(String...args){
          Scanner leitor = new Scanner(System.in);
            System.out.println("digite a distancia: ");
            double distancia = leitor.nextDouble();
            System.out.println("Digite o consumo em km/l");
            double consumo = leitor.nextDouble();
            System.out.println("Preço do litro");
            double preço = leitor.nextDouble();
            double litros = distancia / consumo;
            double custo = litros * preço;
            System.out.println("Litros necessarios: " + litros);
            System.out.printf("custo total R$%.2f", custo);
            leitor.close();
        }
    }