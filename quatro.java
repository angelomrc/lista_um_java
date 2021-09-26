package testando;

import java.util.ArrayList;
import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        ArrayList myArrayList = new ArrayList();        
        System.out.println("Insira o PRIMEIRO número ");
        int num_um =Ler.nextInt();
        System.out.println("Insira o SEGUNDO número ");
        int num_dois =Ler.nextInt();
        int save = num_um;
        System.out.println(" ");
        int cont=0;       
        while(save <= num_dois){           
            for(int i=1; i<= save; i++ ){
                if(save % i == 0){
                    cont=cont+1;
                }                
                }
            if(cont == 2){
                    myArrayList.add(save);
            }         
            cont=0;    
            save=save+1; 
        }    
 System.out.println("Números =="+myArrayList);
int soma=0;
for(int x=0; x < myArrayList.size();x++){
    soma=soma+(int) myArrayList.get(x);
}
System.out.println("[SOMA DOS Nº PRIMOS]== "+soma);
 
      
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
        }  
    }
    

