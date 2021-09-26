package testando;

import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("[RETANGULO] BASE");
        int base =Ler.nextInt();
        System.out.println("[RETANGULO] ALTURA");
        int altura =Ler.nextInt();
        System.out.println("[QUADRADO] LADO");
        int lado =Ler.nextInt();
        lado=lado*lado;
        base=base*altura;
        
        if(base >= lado){
            System.out.println("area retangulo é maior");
            base=base/lado;
            System.out.printf("Cabem um total de %d quadrados",base);
        } else {
            System.out.println("Area muito pequena para ser calculada.");
        }  
    }
}
