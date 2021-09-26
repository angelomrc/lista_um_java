package testando;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author xv
 */
public class um {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        List myArrayList = new ArrayList(); 
        
        float menu = 1;
       
        float soma=0 ,media=0,total=0;
     
        
        while(menu != 0) {
            System.out.println("Insira o número [0]Sair ");
            System.out.println(myArrayList);
            menu=ler.nextFloat();
            if(menu == 0){
                ;
            } else {
                myArrayList.add(menu);
                media=media+1;
                soma=soma+menu;
            }
        }
        
  
        System.out.println("-------------------Resultado-----------------");
        System.out.println(myArrayList);
        System.out.println(" ");
        
        total=soma/media;
        
        System.out.printf("Elementos == %f ",media);
       
        
        System.out.printf("Soma == %f ",soma);
        
         
        
        System.out.printf("Média == %f 5",soma/media);
        

        
    }  
}
















