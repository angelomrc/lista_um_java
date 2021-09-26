package testando;

import java.util.Scanner;


public class tres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Insira valor de X");
        int x=ler.nextInt();
        System.out.println("Insira valor de Y");
        int y=ler.nextInt();
        System.out.println("Insira valor de Z");
        int z=ler.nextInt();
        
        if(x == 0) {
            System.out.println("X igual == 0");
            x=z/y;
            System.out.println("Valor de X == "+x);
        }
        
        if(y == 0) {
            System.out.println("Y igual == 0");
            y=z/x;
            System.out.println("Valor de X == "+y);
            
        }
        if(z == 0) {
            System.out.println("Z igual == 0");
            z=x*y;
            System.out.println("Valor de Z == "+z);        
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
