package Model;

public class ListFactory {
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
