import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NotacaoPolonesa {
    static void execute() throws FileNotFoundException{
        Queue operacao = new LinkedList<Object>();
        Stack aux = new Stack();
        Stack mainStack = new Stack();
        File arq = new File("arquivos\\operacao.txt");
        Scanner ler = new Scanner(arq);

        while (ler.hasNextLine()) {
            operacao.add(ler.nextLine());
        }

        Object[] nextOpAux = new Object[3];
        while (!operacao.isEmpty()){
            Object nextOp = null;
            if (isOperator(operacao.peek())){
                nextOp = operacao.poll();
            }
            for (int i=0; i<nextOpAux.length && !operacao.isEmpty(); i++){
                nextOpAux[i] = operacao.poll();
            }

            if (nextOpAux[0] != null){
                aux.push(nextOpAux[0]);
                nextOpAux[0] =null;
            }
            if (nextOpAux[2] != null){
                aux.push(nextOpAux[2]);
                nextOpAux[2] =null;
            }
            if (nextOpAux[1] != null){
                aux.push(nextOpAux[1]);
                nextOpAux[1] =null;
            }
            if (nextOp!= null){
                aux.push(nextOp);
            }
        }
        aux.push("=");

        while(!operacao.isEmpty()){
            if(isOperator(aux.peek())){
                System.out.println("!!");
                if (operacao.peek().equals("=")){
                    System.out.println("!");
                    System.out.println(aux.pop());
                    return;
                }

                float num1 = Float.parseFloat(aux.pop().toString());
                float num2 = Float.parseFloat(aux.pop().toString());
                String op = operacao.poll().toString();

                aux.push(operacao(num2, num1, op));
            }else {
                aux.push(operacao.poll());
            }
        }
    }

    static boolean isOperator(Object obj){
        return obj.equals("/") || obj.equals("*") || obj.equals("+") || obj.equals("-") || obj.equals("=");
    }

    static float operacao(float num1, float num2, String operator){
        if(operator.equals("/"))
            return (float) num1 / num2;
        if(operator.equals("*"))
            return (float) num1 * num2;
        if(operator.equals("-"))
            return (float) num1 - num2;
        if(operator.equals("+"))
            return (float) num1 + num2;
        return 0;
    }
}
