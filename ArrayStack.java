// Stack implementation using Array

public class ArrayStack implements Stack
{
    // Defaut length of the array used to implement the stack
    public static final int CAPACITY = 1000;

    private int capacity;  // Max stack size
    private Object S[];  // Array used to implement the stack
    private int top = -1; // Index of the top element of the stack

    // Default contructor
    public ArrayStack()
    {
        this(CAPACITY);
    }

    // Alternatif contructor
    public ArrayStack(int cap) 
    {
        capacity = cap;
        S = new Object[capacity];
    }

    // Return number of elements in the stack
    public int size() 
    {
        return(top + 1);
    }

    // Return wheter the stack is full
    public boolean isFull()
    {
        return(size() == capacity);
    }

    // Return whether the stack is empty
    public boolean isEmpty()
    {
        return(top < 0);
    }

    // Return top element in the stack
    public Object peek() throws StackEmptyException
    {
        if(isEmpty())
            throw new StackEmptyException("Stack is empty.");
        return S[top];
    }

    // Insert an element at the top of the stack
    public void push(Object obj) throws StackFullException
    {
        if(isFull())
            throw new StackFullException("Stack is full.");
        top = top + 1;
        S[top] = obj;
    }

    // Remove the top elements from the stack
    public Object pop() throws StackEmptyException
    {
        Object elem;
        if(isEmpty())
            throw new StackEmptyException("NO MORE POP! Stack is empty.");
        elem = S[top];
        top = top - 1;
        return elem;
    }
}
