package exercicioDio;

import java.util.Scanner;

public class exercicioNomeIdade { 
public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);

       String nomealuno;
       int idadealuno;
   
       while(true) {
           System.out.println ("Seu nome:");
           nomealuno=scan.next();
           if (nomealuno.equals("0")) break;
           
           System.out.println("Sua idade:");
           idadealuno=scan.nextInt();
       }
   }
}
    

