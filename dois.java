package testando;

import java.util.Scanner;


public class dois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o PRIMEIRO número");
        int primeiro=ler.nextInt();       
        System.out.println("Insira o SEGUNDO número"); 
        int segundo=ler.nextInt();
        int contador =0,soma =0;      
        
        
        
        
        if(primeiro > segundo){
            System.out.println("Primeiro maior!");
            contador=segundo;
            while(contador < primeiro-1){
                contador=contador+1;
                soma=soma+contador;
            }
              
        } else {
            System.out.println("Segundo maior!");
            contador=primeiro;
            while(contador < segundo-1){
                contador=contador+1;
                soma=soma+contador;   
            }
        }
        System.out.printf("Soma %d | Contador %d",soma,contador);   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
