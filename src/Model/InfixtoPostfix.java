package Model;

import java.util.ArrayList;

public class InfixtoPostfix {

    private String ArrayToString(ArrayList Array){
        StringBuilder result = new StringBuilder();
        for (Object c : Array){
            result.append(c);
        }
        String chain = result.toString();
        return chain;
    }
    private ArrayList<String> StringToArray(String infix){
        ArrayList<String> ArrayInfix = new ArrayList<>();

        for (int i = 0; i < infix.length(); i++) {
            String j= String.valueOf(infix.charAt(i));
            ArrayInfix.add(j);
        }
        return ArrayInfix;
    }

    private boolean isOperation(String value){
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
    }
    private boolean isParenthesis(String value){
        return value.equals("(") || value.equals(")");
    }

    public String InfixtoPostfix(String Infix){
        IStack Operations = new StackArrayList();
        ArrayList<String> Numbers = new ArrayList<>();
        ArrayList<String> InFix = StringToArray(Infix);

        for (String ch : InFix){
            if (!isOperation(ch) && !isParenthesis(ch)){
                Numbers.add(ch);
            } else if (ch.equals("(")) {
                Operations.push(ch);
            } else if (isOperation(ch)) {
                Operations.push(ch);
            } else if (ch.equals(")")) {
                while (!Operations.isEmpty() && !isParenthesis((String) Operations.peek())){
                    Numbers.add((String) Operations.pull());
                }
                Operations.pull();
            } else {
                while (!Operations.isEmpty() && (ch != "*" || ch != "/" && ch== Operations.peek())){
                    Numbers.add((String) Operations.pull());
                }
                Numbers.add((String) Operations.pull());
            }
        }
        while (Operations.count() != 0){
            Numbers.add((String) Operations.pull());
        }

        return ArrayToString(Numbers);
    }
}
