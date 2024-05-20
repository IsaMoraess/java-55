import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
0
0
SOMA = 0 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número:");
    int num1 = sc.nextInt();
    System.out.println("Digite outro número:");
    int num2 = sc.nextInt();
    int resultado = num1 + num2;
    System.out.println("= " +resultado);
    }
}
