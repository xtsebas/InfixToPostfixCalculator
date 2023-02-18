package View;

import Controller.Calculator;
import Model.InfixtoPostfix;

import java.util.Scanner;

public class DriverProgram {
    static Scanner in= new Scanner(System.in);
    static Calculator calculator;
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A LA CALCULADORA DE TEXTO INFIX\n////////////////////////////" +
                "\nPrimero, con cual stack desea realizar su porgrama (debe escribirlo)\nArrayList\nVector\nSingle List\nDouble List");
        String option= in.nextLine();
        calculator= Calculator.getInstance(option);
        System.out.println("\nIngrese la operacion en INFIX que desea realizar:");
        String infix= in.nextLine();
        int result = calculator.mainOperation(infix);
        System.out.println("\nUsted ingreso: " + infix + "\nSu resultado: " + result);
    }

}
