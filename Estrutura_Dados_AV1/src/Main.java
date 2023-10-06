import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("------------Menu------------");
            System.out.println("Qual questão quer executar?");
            System.out.println("Questão 1 - Digite 1");
            System.out.println("Questão 2 - Digite 2");
            System.out.println("Sair - Digite 0");
            System.out.println("----------------------------");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("------------Questão 01------------");
                    System.out.println();
                    Questao01.exec();
                    break;
                case 2:
                    System.out.println("------------Questão 02------------");
                    System.out.println();
                    Questao02.exec();
                    break;
            }

            System.out.println();
            System.out.println("Fim");
            System.out.println();
        }while (opcao != 0);
    }
}