package Model;

import java.util.ArrayList;

public class StackArrayList<T> implements IStack<T>{
    private ArrayList<T> InternList;

    public StackArrayList(){
        InternList = new ArrayList<T>();
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
