package View;

import Model.InfixtoPostfix;

public class DriverProgram {
    public static void main(String[] args) {
        InfixtoPostfix a = new InfixtoPostfix();
        String value= "(1+2)*9";
        System.out.println(value);
        String Postfix = a.InfixtoPostfix(value);
        System.out.println(Postfix);

    }
}
