package atividade13;
import java.util.Scanner;
public class atividade13 {
    public static void main(String[] args) {
    Double numero;
    Scanner valor = new Scanner(System.in);
    System.out.print("Digite um número: ");
    while (!valor.hasNextDouble()){
        System.out.println("Digite um número válido");
        valor.next();
    } 
    numero = valor.nextDouble();
    if (numero>10){
        System.out.println("Este número é maior que dez");
    }   
    else{
    System.out.println("Este número é menor ou igual a dez");
    }
    }
}
