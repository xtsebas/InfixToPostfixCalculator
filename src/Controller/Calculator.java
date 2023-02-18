package Controller;

import Model.IStack;
import Model.InfixtoPostfix;
import Model.ListFactory;

import java.util.ArrayList;

public class Calculator {
    private static IStack<Integer> stackuwu_nia;
    private static Calculator calculator;
    private static ListFactory list= new ListFactory();
    private static InfixtoPostfix infix= new InfixtoPostfix();
    static Postfix pc = new Postfix();
    private static boolean instance_flag = false;

    /**
     * Constructor
     */
    private Calculator(){
        instance_flag =true;
    }

    public static Calculator getInstance(String value){
        if (instance_flag){
            stackuwu_nia= list.ListFactory(value);
            return calculator;
        } else {
            stackuwu_nia= list.ListFactory(value);
            calculator= new Calculator();
            return calculator;
        }
    }


    /**
     * Realiza las operaciones segun los numeros en el Stack
     * @param operator
     * @param A
     * @param B
     */
    private static void getValue(String operator, int A, int B){
        switch(operator){
            case "+":
                stackuwu_nia.push(pc.suma(A, B));
                break;

            case "-":
                stackuwu_nia.push(pc.resta(A, B));
                break;

            case "*":
                stackuwu_nia.push(pc.multiplicacion(A, B));
                break;

            case "/":
                stackuwu_nia.push(pc.division(A, B));
                break;
        }
    }

    /**
     * Realiza e introduce la expresion postfix al Stack, haciendo las operaciones necesarias
     * @param INFIX
     * @return
     */
    public static int mainOperation(String INFIX){
        String postfix = infix.InfixtoPostfix(INFIX);
        ArrayList<String> data = pc.getItems(postfix);
        for (String datum : data) {
            if (!pc.isOperator(datum)) {
                stackuwu_nia.push(Integer.valueOf(datum));
            }
        }

        for (String datum : data) {
            if (pc.isOperator(datum)) {
                int A = stackuwu_nia.pull();
                int B = stackuwu_nia.pull();
                getValue(datum, A, B);
            }
        }

        return stackuwu_nia.pull();
    }
}
