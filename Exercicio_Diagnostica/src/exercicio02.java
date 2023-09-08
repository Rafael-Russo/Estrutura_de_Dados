import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        boolean[][][] espaco = new boolean[5][4][10];
        Scanner ler = new Scanner(System.in);

        for (int x=0; x<5; x++){
            for (int y=0; y<4; y++){
                for (int z=0; z<10; z++){
                    System.out.println("Armário " + (x+1));
                    System.out.println("Prateleira " + (y+1));
                    System.out.println("Espaço " + (z+1));
                    System.out.println("Preenchido? (S/N)");
                    try{
                        switch (ler.next()){
                            case "S":
                                espaco[x][y][z] = true;
                                break;
                            case "N":
                                espaco[x][y][z] = false;
                                break;
                            default:
                                throw new InputMismatchException();
                        }
                    }catch (InputMismatchException e){
                        System.out.println("Input inesperado: " + e);
                        return;
                    }
                }
            }
        }
        for (int x=0; x<5; x++){
            for (int y=0; y<4; y++){
                for (int z=0; z<10; z++){
                    if (espaco[x][y][z]){
                        System.out.print("[1] ");
                    }else {
                        System.out.print("[0] ");
                    }
                }
                System.out.print("\n");
            }
            System.out.println("Armario " + (x+1));
        }
    }
}
