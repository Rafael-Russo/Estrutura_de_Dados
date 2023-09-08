import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int max = 1000;
        int min = 0;
        Scanner ler = new Scanner(System.in);
        int busca;
        boolean existe = false;

        for (int i=0; i< nums.length; i++){
            nums[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }
        for (int num : nums){
            System.out.println(num);
        }
        System.out.println("Digite o número desejado: ");
        busca=ler.nextInt();
        for (int i=0; i< nums.length; i++){
            if (nums[i] == busca){
                System.out.println("O item desejado está na " + (i+1) + "º posição (indice = " + i + ")");
                existe = true;
            }else {
                existe = false;
            }
        }

        if (!existe){
            System.out.println("Não achei o número solicitado!");
        }
    }
}