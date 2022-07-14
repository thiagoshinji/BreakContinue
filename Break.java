
package breakcontinue;

import java.util.Scanner;

public class Break {
    
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
                // tente remover o break para entender oque acontece
                break;
            }
        }
    }
}
