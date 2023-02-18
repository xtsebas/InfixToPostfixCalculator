package Model;

import structure.*;
import structure5.SinglyLinkedList;

public class StackUsingSingleList<T>  implements IStack<T>{

    private SinglyLinkedList<T> InternList;

    public StackUsingSingleList(){
        InternList = new SinglyLinkedList<>();
    }

    @Override
    public int count() {
        return InternList.size();
    }

    @Override
    public boolean isEmpty() {
        return InternList.isEmpty();
    }

    @Override
    public void push(T value) {
        InternList.add(0, value);
    }

    @Override
    public T pull() {
        return InternList.remove(0);
    }

    @Override
    public T peek() {
        return InternList.get(0);
    }
}
