import java.util.Random;

public class Questao02 {
    static void exec(){
        int[][] vet = new int[40][40];
        int max = 5;
        int min = 0;

        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count0=0;

        for(int x=0; x < 40; x++){
            for (int y=0; y<40; y++){
                vet[x][y] = (int) Math.floor(Math.random() * (max - min + 1) + min);
                switch (vet[x][y]){
                    case 1:
                        count1++;
                        break;
                    case 2:
                        count2++;
                        break;
                    case 3:
                        count3++;
                        break;
                    case 4:
                        count4++;
                        break;
                    case 5:
                        count5++;
                        break;
                    default:
                        count0++;
                }
            }
        }
        System.out.println("Tem " + count1 + " prateleiras com Xampu");
        System.out.println("Tem " + count2 + " prateleiras com Condicionador");
        System.out.println("Tem " + count3 + " prateleiras com Hidratante");
        System.out.println("Tem " + count4 + " prateleiras com Tintura");
        System.out.println("Tem " + count5 + " prateleiras com Demaquilante");
        System.out.println("Tem " + count0 + " prateleiras vazias");
    }
}
