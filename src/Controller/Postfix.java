package Controller;

import Model.IStack;

import java.util.ArrayList;

public class Postfix implements IPostfix{
    @Override
    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }

    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }

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
