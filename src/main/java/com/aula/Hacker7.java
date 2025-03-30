package com.aula;
import java.util.Scanner;

/**
 *
 * @author kethe
 */
public class Hacker7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nunLinha = 1;

        while (scanner.hasNext()) {
            String linha = scanner.nextLine();
            System.out.println(nunLinha + " " + linha);
            nunLinha++;
        }

        scanner.close();
    }
}
