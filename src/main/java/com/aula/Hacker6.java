package com.aula;
import java.util.Scanner;

/**
 *
 * @author kethe
 */
public class Hacker6 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantos numeros deseja inserir: ");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) //verifica se o numero esta entre o parametro
                {
                    System.out.println("* byte");
                }
                
                if(x >= -32768 && x <= 32767) //verifica se o numero esta entre o parametro
                {
                    System.out.println("* short");
                }
                if(x >= -2147483648 && x <= 2147483647)//verifica se o numero esta entre o parametro
                {
                    System.out.println("* int");
                }
                 System.out.println("* long"); //nao tem como por if else, pq um numero pode entrar em varios casos e long entra em todos os casos, por ser grandao
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere."); //frase já veio do hackerrank
            }

        }
    }
}
