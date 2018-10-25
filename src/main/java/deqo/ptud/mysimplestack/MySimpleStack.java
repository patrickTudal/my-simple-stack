package deqo.ptud.mysimplestack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class MySimpleStack implements SimpleStack{

    List<Item> myStack = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    @Override
    public int getSize() {
        return myStack.size();
    }

    @Override
    public void push(Item item) {
        myStack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return myStack.get(0);
    }

    @Override
    public Item pop() throws EmptyStackException {
        return myStack.remove(0);
    }
}
