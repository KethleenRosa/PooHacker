package com.aula;
import java.util.Scanner;

/**
 *
 * @author kethe
 */
public class Hacker5 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserir a quantidade de vezes que o programa ira rodar:");
        int t=in.nextInt(); //esse eh o q do problema
        if(t > 500)
        {
            System.out.println("O numero de consultas nao pode ultrapassar 500.");
        }
        else
        {
           for(int i=0;i<t;i++)
           {
            System.out.println("Inserir o valor de a:");
            int a = in.nextInt();
            System.out.println("Inserir o valor de b:");
            int b = in.nextInt();
            System.out.println("Inserir o valor de n:");
            int n = in.nextInt();

            if(n >=16 || n <= 0 || a >= 51 || a < 0 || b >= 51 || b < 0)
            {
                System.out.println("Nao eh possivel realizar pois infrigiu alguma das regras: n precisa estar entre 1 e 15 e a,b precisar estar entre 0 e 50");
            }
                else
            {
                int aux;
                double conta = 0;
                conta = a;
                for(aux = 0; aux < n;aux++)
                {
                    conta += Math.pow(2,aux) *b;
                    System.out.println("S"+aux+" = "+conta);  
                }
            }
           } 
        }
       in.close(); 
    }
}
