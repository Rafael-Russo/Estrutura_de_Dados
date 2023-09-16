import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExercicioFila  {

    public static void exercicio02 () throws FileNotFoundException{
        Queue<String> fila = new LinkedList<>();
        Random random = new Random();
        Scanner ler =new Scanner(new File("arquivos\\ingressos.txt"));

        while (ler.hasNextLine()){
            fila.add(ler.nextLine());
        }

        for (int i=0; i< 10; i++){
            System.out.println("VIP nº" + (i+1) + ": " + fila.poll());
        }

        List<String> filaLista = new LinkedList<>(fila);

        int sorteio = random.nextInt(fila.size());

        System.out.println("O ingreso nº" + sorteio + " foi sorteado para conhecer a banda");
        System.out.println("Parabéns " + filaLista.get(sorteio) + "!");
    }
}
