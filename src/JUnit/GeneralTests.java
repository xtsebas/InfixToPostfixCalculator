package JUnit;

import Controller.Calculator;
import Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneralTests {
    static String value= "vector";
    IStack JunitStack= new StackUsingVector<>();
    static String value1= "(1+2)*9";

    @Test
    void ListFactory(){
        ListFactory a= new ListFactory();
        assertEquals(a.ListFactory(value), JunitStack);
    }

    @Test
    void InfixtoPostfix() {
        String result = "12+9*";
        InfixtoPostfix a = new InfixtoPostfix();
        assertEquals(a.InfixtoPostfix(value1), result);
    }

    @Test
    void mainOperation(){
        int result= 27;
        Calculator calculator= Calculator.getInstance(value);
        assertEquals( calculator.mainOperation(value1), result);
    }
}