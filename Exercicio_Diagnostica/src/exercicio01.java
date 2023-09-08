import java.util.Scanner;
import java.util.Random;
public class exercicio01 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int countMaior30 = 0;
        Random rnd = new Random();
        int soma30 = 0;
        int somaTotal = 0;

        for (int i=0; i< numeros.length; i++){
            numeros[i] = rnd.nextInt(99);
            somaTotal+=numeros[i];
            if (numeros[i]>30){
                countMaior30++;
                soma30 += numeros[i];
            }
        }

        System.out.println("Tem "+countMaior30+" numeros maiores que 30");
        System.out.println("A soma dos números maiores que 30 é: " + soma30);
        System.out.println("A soma de todos os números é: " + somaTotal);
    }
}