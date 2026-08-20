import java.util.Scanner;
public class Exercicio4{
    static public void main(String abc []){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        //byte (1byte), short(2 bytes), int(4 bytes), long (8 bytes)
        int numero = leitor.nextInt();
        if(numero  % 2 == 0){
            System.out.println("o numero é par");
        }
        else // dangling else
            System.out.println("O numero é impar");
        leitor.close();
    }
}