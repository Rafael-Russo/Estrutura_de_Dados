import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NotacaoPolonesa {
    static void execute() throws FileNotFoundException{
        Queue operacao = new LinkedList<Object>();
        Stack aux = new Stack();
        File arq = new File("arquivos\\operacao.txt");
        Scanner ler = new Scanner(arq);

        Object wait = null;
        Object lerAux = null;
        Object lerAux2 = null;
        while (ler.hasNextLine()) {
            lerAux = ler.nextLine();

            if (ler.hasNextLine()){
                lerAux2 = ler.nextLine();
            }

            if (!isOperator(lerAux)){
                operacao.add(lerAux);
            }else if (lerAux.equals("*")){
                operacao.add(lerAux2);
                operacao.add(lerAux);
            }else if (lerAux.equals("/")){
                operacao.add(lerAux2);
                operacao.add(lerAux);
            }else {
                wait = lerAux;
            }
            if (wait !=null && isOperator(lerAux2) ) {
                operacao.add(wait);
                wait = null;
            }
        }

        System.out.println(operacao);

        while(!operacao.isEmpty()){
            if(isOperator(operacao.peek())){
                if (operacao.peek().equals("=")){
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
