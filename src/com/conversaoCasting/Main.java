package com.conversaoCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 1. Ler um valor do console
        System.out.println("Digite um número inteiro: ");
        Scanner leitor = new Scanner(System.in);
        
        // Armazena o valor em uma variável de tipo primitivo (int)
        int valorInt = leitor.nextInt();
        
        System.out.println("O valor digitado é: " + valorInt);
        
        // 2. Fazer o casting
        // Aqui convertemos um 'int' para 'byte' (int é maior que byte)
        // Isso exige um casting explícito.
        byte valorByte = (byte) valorInt;
        
        // 3. Imprimir o resultado
        System.out.println("O valor original (int) é: " + valorInt);
        System.out.println("O valor convertido (byte) é: " + valorByte);

        // Fechar o scanner
        leitor.close();
    }
}