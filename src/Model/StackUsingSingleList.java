package Model;

import structure5.SinglyLinkedList;

public class StackUsingSingleList<T>  implements IStack<T>{

    private SinglyLinkedList<T> InternList;

    /**
     * Constructor
     */
    public StackUsingSingleList(){
        InternList = new SinglyLinkedList<>();
    }

    /**
     * Count how many Objects are in the list
     * @return
     */
    @Override
    public int count() {
        return InternList.size();
    }

    /**
     *Confirm if the list is empty
     * @return
     */
    @Override
    public boolean isEmpty() {
        return InternList.isEmpty();
    }

    /**
     *add an object to the list
     * @param value
     */
    @Override
    public void push(T value) {
        InternList.add(0, value);
    }

    /**
     *takes the last object; which was the last to be added, out of the list
     * @return
     */
    @Override
    public T pull() {
        return InternList.remove(0);
    }

    /**
     *show the last object to be added
     * @return
     */
    @Override
    public T peek() {
        return InternList.get(0);
    }
}
