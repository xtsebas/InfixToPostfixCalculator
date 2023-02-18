package Model;
import structure5.*;

public class StackUsingDoubleList<T> implements IStack<T>{
    private DoublyLinkedList<T> InternList;

    public StackUsingDoubleList(){
        InternList = new DoublyLinkedList<>();
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
