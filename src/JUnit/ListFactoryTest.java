package JUnit;

import org.junit.jupiter.api.Assertions.*;

import Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListFactoryTest {
    String value= "vector";
    IStack JunitStack= new StackUsingVector<>();

    @Test
    void ListFactory(){
        ListFactory a= new ListFactory();
        assertEquals(a.ListFactory(value), JunitStack);
    }
}