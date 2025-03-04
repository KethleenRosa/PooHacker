/*
Dado um número inteiro,, imprima seu primeiromúltiplos. Cada múltiplo(onde) deve ser impresso em uma nova 
linha no formato: N x i = result.
*/

package com.aula;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kethe
 */
public class Hacker4 {
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim()); //linha dada pelo hackerrank, eu faria como o anterior e com NextInt();
        int i;
        for(i = 0; i <= 9; i++){
           System.out.println(N + " x " + (i+1) + " = " + N*(i+1)); 
        }
        bufferedReader.close();
    }
}
