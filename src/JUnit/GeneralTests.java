package JUnit;

import Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneralTests {
    String value= "vector";
    IStack JunitStack= new StackUsingVector<>();

    @Test
    void ListFactory(){
        ListFactory a= new ListFactory();
        assertEquals(a.ListFactory(value), JunitStack);
    }

    @Test
    void InfixtoPostfix() {
        String value= "(1+2)*9";
        String result = "12+9*";
        InfixtoPostfix a = new InfixtoPostfix();
        assertEquals(a.InfixtoPostfix(value), result);
    }
}