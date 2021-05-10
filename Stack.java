// Interface Stack

public interface Stack
{
    // Return number of elements in the stack
    public int size();

    // Return whether the stack is full
    public boolean isFull();

    // Return whether the stack is empty
    public boolean isEmpty();

    // Return top element is the stack
    public Object peek() throws StackEmptyException;

    // Insert an element at the top of the stack
    public void push (Object item) throws StackFullException;

    // Remove the top element from the stack
    public Object pop() throws StackEmptyException;
}