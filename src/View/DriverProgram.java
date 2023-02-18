package View;

import Controller.Calculator;
import Model.InfixtoPostfix;

import java.util.Scanner;

/**
 * @Author Sebastian
 */
public class DriverProgram {
    /**
     *
     */
    static Scanner in= new Scanner(System.in);
    static Calculator calculator;
    static InfixtoPostfix just = new InfixtoPostfix();

    /**
     * Initial Program
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A LA CALCULADORA DE TEXTO INFIX\n////////////////////////////" +
                "\nPrimero, con cual stack desea realizar su porgrama (debe escribirlo)\nArrayList\nVector\nSingle List\nDouble List");
        String option= in.nextLine();
        calculator= Calculator.getInstance(option);
        System.out.println("\nIngrese la operacion en INFIX que desea realizar:");
        String infix= in.nextLine();
        int result = calculator.mainOperation(infix);
        System.out.println("\nUsted ingreso: " + infix + "\nSu expresion en Postfix es: " + just.InfixtoPostfix(infix) +"\nSu resultado: " + result);
    }

}
