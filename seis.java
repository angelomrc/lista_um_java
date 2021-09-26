package testando;

import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de quadrados ");
        int quantidade =ler.nextInt();
        int cont = 0;
        String simbolo = "*";
        String amount = "";
            
        while(cont < quantidade){
            cont=cont+1;
            amount=amount+simbolo;      
        }        
        cont=0;      
        quantidade=quantidade-2;
        System.out.println(amount);
       
        while(cont < quantidade){
            simbolo=simbolo+" ";
            cont=cont+1;
        }
        simbolo=simbolo+"*";
        
        for(int i =0; i<quantidade;i++){
            System.out.println(simbolo); 
        }
        System.out.println(amount);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
