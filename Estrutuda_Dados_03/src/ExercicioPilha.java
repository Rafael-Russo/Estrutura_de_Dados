import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
    static void exercico01() throws FileNotFoundException {
        Stack pilha = new Stack();
        File arq = new File("arquivos\\pesquisas.txt");
        Scanner ler = new Scanner(arq);


        while (ler.hasNextLine()) {
            pilha.push(ler.nextLine());
        }

        int i=0;

        while (pilha.size() > 10){
            if (i<10){
                System.out.println("top " + (i+1) + ": " + pilha.elementAt(i));
                i++;
            }else {
                pilha.remove(i);
            }
        }
        System.out.println(pilha);
    }
}
