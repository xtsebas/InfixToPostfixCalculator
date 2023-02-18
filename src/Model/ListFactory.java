package Model;

import structure.*;

import java.util.Scanner;

public class ListFactory {
    private IStack ListFactory(String type){
        Scanner in= new Scanner(System.in);

        IStack InternStack = null;

        switch (type.toLowerCase()){
            case ("arraylist"):
                InternStack= new StackArrayList<String>();
                break;
            case ("vector"):
                InternStack = new StackUsingVector<String>();
                break;
            case ("list"):
                System.out.println("Usted quiere una lista: \n1. Simple Encadenada\n2. Doblemente Encadenada");
                int i= in.nextInt();
                switch (i){
                    case 1:
                        InternStack = new StackUsingSingleList<String>();
                        break;
                    case 2:
                        InternStack = new StackUsingDoubleList<String>();
                        break;
                }
                break;
        }
        return InternStack;
    }
}
