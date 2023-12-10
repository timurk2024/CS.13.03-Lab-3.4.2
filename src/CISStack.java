import java.util.Arrays;

public class CISStack {

    // Array property.
    private int[] stack;

    // Size property.
    private int size;

    // Pointer property
    private int pointer;

    // Constructor.
    public CISStack(int length) {
        // Initialize the array with the given length.
        // Size is 0 since there are no elements initially.
        // Pointer is -1 since there is no top element yet.
        stack = new int[length];
        size = 0;
        pointer = -1;
    }
    // Push. This method pushes a value onto the top of the stack.
    public void push(int item) {
        // Ensure the stack isn't full
        if (pointer + 1 < stack.length) {
            stack[++pointer] = item; // Increment pointer and add the new item
            size++;
        } else {
            throw new StackOverflowError("Stack is full");
        }
    }

    // Pop. This method pops a value from the top of the stack.
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int item = stack[pointer];
        //stack[pointer] = null;
        pointer--;
        size--;
        return item;
    }

    // isEmpty. Returns a boolean indicating whether the array is empty.
    public boolean isEmpty() {
        return size == 0;
    }
    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the stack in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}
    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }

}
