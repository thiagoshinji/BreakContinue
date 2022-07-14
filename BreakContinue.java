/*
package breakcontinue;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {
        //utilizando o break
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero = scan.nextInt();
        
        System.out.println("Digite um limite");
        int limite = scan.nextInt();
        
        for (int i = numero ; i <= limite ; i++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println(i + " Is um numero divisivel por 7");
                break;
            }
        }
        /*
         loop de baixo nível (go to)
         não é utilizado nos dias de hoje
         não é boa prática java
        
        for (int i = 0 ; i <= 4 ; i++){
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1){
                            break rotulo1;
                        }
                        if (i == 2){
                            break rotulo2;
                        }
                        if (i == 3){
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }
        
        // utilizando o continue
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero = scan.nextInt();
        
        System.out.println("Digite um limite");
        int limite = scan.nextInt();
        
        for (int i = numero ; i <= limite ; i++){
            if (i % 7 == 0){
                continue;
            }
            System.out.println(i + " Is not um numero divisivel por 7");
        }

    }
    
}
*/