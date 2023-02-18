package Model;

import java.util.ArrayList;

public class InfixtoPostfix {

    /**
     * Transform an Arraylist to a string chain
     * @param Array
     * @return
     */
    private String ArrayToString(ArrayList Array){
        StringBuilder result = new StringBuilder();
        for (Object c : Array){
            result.append(c);
        }
        String chain = result.toString();
        return chain;
    }

    /**
     * Transform a String chain to an Arraylist
     * @param infix
     * @return
     */
    private ArrayList<String> StringToArray(String infix){
        ArrayList<String> ArrayInfix = new ArrayList<>();

        for (int i = 0; i < infix.length(); i++) {
            String j= String.valueOf(infix.charAt(i));
            ArrayInfix.add(j);
        }
        return ArrayInfix;
    }

    /**
     * evaluates if the param is an operation or not
     * @param value
     * @return
     */
    private boolean isOperation(String value){
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
    }

    /**
     * evaluates if the param is a parenthesis or not
     * @param value
     * @return
     */
    private boolean isParenthesis(String value){
        return value.equals("(") || value.equals(")");
    }

    /**
     * Transform the infix expression to a Postfix expression, implements methods of this class
     * @param Infix
     * @return
     */
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
