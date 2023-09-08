import java.util.Arrays;
import java.util.Scanner;

public class Fila {
    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    Object f[];

    public Fila() {
    }

    public Fila(int t){
        inicio = fim = -1;
        tamanho = t;
        f = new Object[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adicionar(int e){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public void adicionarStr(String e){
        if (!estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover(){
        if (! estaVazia() ){
            inicio++;
            qtdeElementos--;
        }
    }

    public void mostrar(){
        for (int i = inicio; i<=fim; i++) {
            System.out.println(f[i]);
        }
    }

    public void exercio01(){
        Fila senhas = new Fila(150);
        Fila prioridade = new Fila(50);
        for (int i=1; i<=200; i++){
            if (i%2 == 1 && i <=100){
                prioridade.adicionar(i);
            }
            if ((i%2 == 0 && i<=100) || i>=100){
                senhas.adicionar(i);
            }
        }

        senhas.mostrar();
        System.out.println();
        System.out.println("----------------");
        System.out.println();
        prioridade.mostrar();
    }

    public void exercicio02(){
        Scanner ler = new Scanner(System.in);

        Fila noiva = new Fila(60);
        Fila noivo = new Fila(55);
        Fila convidados = new Fila(115);
        for (int i=0; i<60; i++){
            System.out.println("Digite o nome do " + (i+1) + "º convidado da noiva: ");
            noiva.adicionarStr(ler.nextLine());
            convidados.adicionarStr(noiva.f[i].toString());
        }
        for (int i=0; i<55; i++){
            System.out.println("Digite o nome do " + (i+1) + "º convidado do noivo: ");
            noivo.adicionarStr(ler.nextLine());
            convidados.adicionarStr(noivo.f[i].toString());
        }

        String[] convidadosArray = new String[convidados.qtdeElementos];
        for (int i = 0; i < convidados.qtdeElementos; i++) {
            convidadosArray[i] = convidados.f[i].toString();
        }

        Arrays.sort(convidadosArray);

        System.out.println("Convidados ordenados em ordem alfabética:");
        for (String convidado : convidadosArray) {
            System.out.println(convidado);
        }
    }
}
