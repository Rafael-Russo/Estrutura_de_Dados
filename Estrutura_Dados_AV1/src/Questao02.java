import java.util.Random;

public class Questao02 {
    static void exec(){
        int[][] vet = new int[40][40];
        int max = 5, min = 0;
        int[] count=new int[6];
        String[] produtos = {"Vazio", "Xampu", "Condicionador", "Hidratante", "Tintura", "Demaquilante"};

        for(int x=0; x < 40; x++){
            for (int y=0; y<40; y++){
                vet[x][y] = (int) Math.floor(Math.random() * (max - min + 1) + min);
                switch (vet[x][y]){
                    case 1:
                        count[1]++;
                        break;
                    case 2:
                        count[2]++;
                        break;
                    case 3:
                        count[3]++;
                        break;
                    case 4:
                        count[4]++;
                        break;
                    case 5:
                        count[5]++;
                        break;
                    default:
                        count[0]++;
                }
            }
        }
        for (int i=0; i<produtos.length; i++){
            System.out.println("Tem " + count[i] + " prateleiras com " + produtos[i]);
        }
    }
}
