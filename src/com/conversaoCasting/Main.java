package com.conversaoCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Ler um valor do console e armazenar em uma variável primitiva
        System.out.println("Digite um número inteiro: ");
        Scanner leitor = new Scanner(System.in);

        int valorPrimitivo = leitor.nextInt();

        // 2. Fazer o autoboxing (conversão de primitivo para wrapper)
        // Convertendo o tipo 'int' para o tipo 'Integer' (wrapper)
        Integer valorWrapper = valorPrimitivo; // Autoboxing

        // 3. Imprimir os resultados
        System.out.println("O valor primitivo (int) é: " + valorPrimitivo);
        System.out.println("O valor wrapper (Integer) é: " + valorWrapper);

        // Fechar o scanner
        leitor.close();
    }
}