package br.com.exemplo.arvorebinaria;

public class Arvore {
    private No raiz;
    public Arvore() {
            raiz = null;
        }

    public No getRaiz() {
        return raiz;
    }

    pulic int menorValor(No node) {
        int menorValor = node.valor;
        while (node.esquerda != null) {
            menorValor = node.esquerda.valor;
            node = node.esquerda;
        }
        return menorValor;
    }

    public void inserir(int valor) {
            raiz = inserirRecursivo(raiz, valor);
        }

    private No inserirRecursivo(No node, int valor) {
        if (node == null) {
            node = new No(valor);
            return node;
        }

        if (valor < node.valor) {
            node.esquerda = inserirRecursivo(node.esquerda, valor);
        } else if (valor > node.valor) {
            node.direita = inserirRecursivo(node.direita, valor);
        }

        return node;
    }

    public boolean pesquisar(int valor) {
            return pesquisarRecursivo(raiz, valor);
        }

    private boolean pesquisarRecursivo(No node, int valor) {
        if (node == null) {
            return false;
        }

        if (valor == node.valor) {
            return true;
        }

        if (valor < node.valor) {
            return pesquisarRecursivo(node.esquerda, valor);
        }

        return pesquisarRecursivo(node.direita, valor);
    }

    public void imprimir() {
            imprimirRecursivo(raiz, 0);
        }
    private void imprimirRecursivo(No node, int nivel) {
        if (node != null) {
            imprimirRecursivo(node.direita, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }
            System.out.println(node.valor);
            imprimirRecursivo(node.esquerda, nivel + 1);
        }
    }

    public void deletar(int valor){ raiz = deletarRecursivo(raiz, valor); }
    private No deletarRecursivo(No node, int valor) {
        if (node == null) {
            return null;
        }

        if (valor < node.valor) {
            node.esquerda = deletarRecursivo(node.esquerda, valor);
        } else if (valor > node.valor) {
            node.direita = deletarRecursivo(node.direita, valor);
        } else {
            if (node.esquerda == null)
                return node.direita;
            else if (node.direita == null)
                return node.esquerda;

            node.valor = menorValor(node.direita);

            node.direita = deletarRecursivo(node.direita, node.valor);
        }

        return node;
    }

    public void percorrerInOrdem() {
        percorrerInOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerInOrdemRecursivo(No node) {
        if (node != null) {
            percorrerInOrdemRecursivo(node.esquerda);
            System.out.print(node.valor + " ");
            percorrerInOrdemRecursivo(node.direita);
        }
    }

    public void percorrerPreOrdem() {
        percorrerPreOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPreOrdemRecursivo(No node) {
        if (node != null) {
            System.out.print(node.valor + " ");
            percorrerPreOrdemRecursivo(node.esquerda);
            percorrerPreOrdemRecursivo(node.direita);
        }
    }

    public void percorrerPosOrdem() {
        percorrerPosOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPosOrdemRecursivo(No node) {
        if (node != null) {
            percorrerPosOrdemRecursivo(node.esquerda);
            percorrerPosOrdemRecursivo(node.direita);
            System.out.print(node.valor + " ");
        }
    }
}