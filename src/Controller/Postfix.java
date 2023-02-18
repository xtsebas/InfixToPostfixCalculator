package Controller;

import Model.IStack;

import java.util.ArrayList;

public class Postfix implements IPostfix{

    /**
     * count how many objects are in the stack
     * @param operandos
     * @return
     */
    @Override
    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }

    /**
     * sum a and b
     * @param a
     * @param b
     * @return
     */
    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    /**
     * subtract a and b
     * @param a
     * @param b
     * @return
     */
    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    /**
     * multiply a and b
     * @param a
     * @param b
     * @return
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    /**
     * divide a and b
     * @param a
     * @param b
     * @return
     */
    @Override
    public int division(int a, int b) {
        return a/b;
    }

    /**
     * evaluates if the item is an operator or not
     * @param item
     * @return
     */
    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }

    /**
     * Transform a String chain to an Arraylist
     * @param _expresion
     * @return
     */
    @Override
    public ArrayList<String> getItems(String _expresion) {
        ArrayList<String> ArrayInfix = new ArrayList<>();

        for (int i = 0; i < _expresion.length(); i++) {
            String j= String.valueOf(_expresion.charAt(i));
            ArrayInfix.add(j);
        }
        return ArrayInfix;
    }
}
//CODIGO TOMADO DE LA HOJA DE TRABAJO 2
//EQUIPO NUMERO 4
//INTEGRANTES SEBASTIAN HUERTAS, XAVIER LOPEZ, GERSON RAMIREZ