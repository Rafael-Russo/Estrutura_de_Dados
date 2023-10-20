import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Questao01 {
    static void exec() throws FileNotFoundException{
        LinkedList<String> lista = new LinkedList<String>();
        try (Scanner scanner = new Scanner(new File("arquivos\\Lista_URL.txt"))) {
            while (scanner.hasNextLine()) {
                lista.add(scanner.nextLine());
            }
            lista.remove(0);
            for (String elemento : lista) {
                System.out.println(lista.indexOf(elemento) + " - " + elemento);
            }
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha um link para ser excluido: ");
            int iDel = ler.nextInt();
            try{
                String itemRemovido = lista.remove(iDel);
                if(!itemRemovido.isEmpty()){
                    System.out.println("O link " + itemRemovido + " foi removido!");
                }else {
                    System.out.println("link não encontrado!");
                }
            }catch (IndexOutOfBoundsException err){
                System.out.println("link não encontrado!");
            }
            System.out.println("Agora a lista tem " + lista.size() + " registros");
            for (String elemento : lista) {
                System.out.println(lista.indexOf(elemento) + " - " + elemento);
            }
            System.out.println("Digite o link que está buscando: ");
            ler = new Scanner(System.in);
            String link = ler.nextLine();
            if(lista.contains(link)){
                System.out.println("Link encontrado!");
            }else {
                System.out.println("Link não encontrado!");
            }
        }
    }
}
