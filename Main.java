/*Faça um programa que receba dois 
números inteiros e gere os números 
inteiros que estão no intervalo 
compreendido por eles*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = scan.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = scan.nextInt();
    System.out.println("Os inteiros entre " + numero1 + " e " + numero2 + " são: ");

    int count = numero1;
    if(count < numero2){
      while(count <= numero2){
      System.out.println(count);
      count++;  
      }
     }else if(count >numero2){
          while(count >= numero2){
          System.out.println(count);
          count--;            
          }
      }
    }
}
