package br.com.exemplo.arvorebinaria;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore. inserir(10);
        arvore.inserir(7);
        arvore.inserir(15);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(12);
        arvore.inserir(20);
        arvore.inserir(25);
        arvore.inserir(30);

        Arvore arvore2 = new Arvore();
        arvore2. inserir(10);
        arvore2.inserir(7);
        arvore2.inserir(15);
        arvore2.inserir(5);
        arvore2.inserir(3);
        arvore2.inserir(12);
        arvore2.inserir(20);
        arvore2.inserir(25);
//        arvore2.inserir(30);


        System.out.println("Árvore binária:");
        arvore.imprimir();
        System.out.println("Árvore binária 2:");
        arvore2.imprimir();
        System.out.println("\n**** Impressão dos valores da Árvore ****");
        System.out.println("\nIN-ORDEM");
        arvore.imprimirInOrdem();
        System.out.println("\nPRÉ-ORDEM");
        arvore.imprimirPreOrdem();
        System.out.println("\nPÓS-ORDEM");
        arvore.imprimirPosOrdem();
        int valorProcurado = 7;
        boolean encontrado = arvore.pesquisar(valorProcurado);
        System.out.println("\nO maior valor é " + arvore.encontrarMaiorValor(arvore.getRaiz()));
        System.out.println("\nO menor valor é " + arvore.encontrarMenorValor(arvore.getRaiz()));
        System.out.println("\nValor " + valorProcurado + " encontrado na árvore: " + encontrado);
        System.out.println("\nA árvore 1 é igual a árvore 2? " + arvore.saoIguais(arvore2));
        System.out.println("raiz " + arvore.getRaiz().valor);
      /*  System.out.println("\n**** Teste e Exclusão ****");
        System.out.println("\nExcluindo o elemento 3");
        arvore.excluir(3);
        arvore.imprimir();
        System.out.println("\nExcluindo o elemento 10");
        arvore.excluir(10);
        arvore.imprimir();*/

    }
}
