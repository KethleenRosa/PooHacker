
package com.aula;
import java.util.Scanner;
/**
 *
 * @author kethe
 */
public class Hacker2 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        if(N < 1 || N > 100)    
        {
            System.out.println("O numero nao esta no intervalo de 1 a 100");
        }
        else
        {
            if(N%2 == 1)
            {
                System.out.println("Weird");
            }
            else
            {
                if(N >= 2 && N <= 5)
                {
                    System.out.println("Not Weird");
                }
                else
                {
                    if(N <= 20)
                    {
                        System.out.println("Weird");
                    }
                    else
                    {
                        System.out.println("Not Weird");
                    }
                }
            }
        }
    }

}
