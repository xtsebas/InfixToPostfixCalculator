package Model;

public class ListFactory {
    /**
     * uses the factory algorithm to create the stack with the User choice
     * @param type
     * @return
     */
    public IStack ListFactory(String type){

        IStack InternStack = null;

        switch (type.toLowerCase()){
            case ("arraylist"):
                InternStack= new StackArrayList<String>();
                break;
            case ("vector"):
                InternStack = new StackUsingVector<String>();
                break;
            case ("single list"):
                InternStack = new StackUsingSingleList<String>();
                break;
            case ("double list"):
                InternStack = new StackUsingDoubleList<String>();
                break;
        }
        return InternStack;
    }
}
