import java.util.Scanner;

public class questao02 {

    public static int binSearch(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] vet = new int[50];
        int aux = 0;
        int i = 0;
        int max = 10000;
        int min = -10000;
        int busca;
        Scanner ler = new Scanner(System.in);

        for (int x=0; x< vet.length; x++){
            vet[x] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }

        System.out.println("Vetor desordenado: ");
        for(i = 0; i<vet.length; i++){
            System.out.println(" "+vet[i]);
//            if (menor>vet[i]){
//                menor = vet[i];
//            }
//            if (maior<vet[i]){
//                maior = vet[i];
//            }
        }
        System.out.println("---------");

        for(i = 0; i<vet.length; i++){
            for(int j = 0; j<(vet.length-1); j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<vet.length; i++){
            System.out.println(" "+vet[i]);
        }

        System.out.println("Digite o valor que deseja buscar: ");
        busca = ler.nextInt();
        System.out.println("O valor buscado está na " + (binSearch(vet, busca, 0, vet.length)+1) + "º posição (index = " + binSearch(vet, busca, 0, vet.length) + ")");
    }
}
