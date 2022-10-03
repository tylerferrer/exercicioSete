package com.mycompany.exercicio7;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio7 {

    public static void main(String[] args) {
//        Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a medida do lado do quadrado: ");
        int lado = entrada.nextInt();
        entrada.close();

//    Calculo de área do quadrado
        int area = lado * lado;

//    Calculr o dobro da área do quadrado
        int dobro = area * 2;
        
        System.out.print("O dobro da área do quadrado de lado " + lado + "é igul a " + dobro);
    }
}
