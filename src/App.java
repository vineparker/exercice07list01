import java.util.Scanner;

class Main {
  //  Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
  public static void main(String[] args) {

    // setando input keyboard
    Scanner input = new Scanner(System.in);
    

    // informe o raio de um circulo
    String textoUm = "Informe o valor do lado de um quadrado";
    System.out.print(textoUm);
    double lado = input.nextInt();

    // fazer o calculo de conversao de raio para area
    double area = (lado * lado); 

    // mostrar o resultado da convesao
    System.out.println("O Dobro da área do quadrado é igual a:" + (area + area) + ("cm²"));

    input.close();
  }
}





