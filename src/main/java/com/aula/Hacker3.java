package com.aula;
import java.util.Scanner;

/**
 *
 * @author kethe
 */
public class Hacker3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o numero inteiro:");
        int i = scan.nextInt();
        //scan.nextLine();
        System.out.println("Escreva o numero double:");
        double d = scan.nextDouble();
        //System.out.println("Escreva uma palavra ou frase:");
        scan.nextLine(); // Limpa o buffer do Scanner
       // scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])");

        System.out.println("Escreva uma palavra ou frase:");
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}
