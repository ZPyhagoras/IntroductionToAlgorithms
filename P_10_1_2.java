import java.util.Arrays;

public class P_10_1_2 {
    private int[] buffer;
    private int left, right;
    private int size;
    public P_10_1_2(int n) {
        size = n;
        buffer = new int[size];
        left = 0;
        right = n - 1;
    }

    public boolean isEmptyL() {
        return left == 0;
    }

    public boolean isEmptyR() {
        return right == size - 1;
    }

    public boolean isFull() {
        return right < left;
    }

    public void pushL(int x) throws StackException {
        if (!isFull()) {
            buffer[left] = x;
            left++;
        }
        else {
            showStack();
            throw new StackException("Left stack is overflow");
        }
    }
    
    public void pushR(int x) throws StackException {
        if (!isFull()) {
            buffer[right] = x;
            right--;
        }
        else {
            showStack();
            throw new StackException("Right stack is overflow");
        }
    }

    public int popL() throws StackException {
        if (!isEmptyL()) {
            left--;
            return buffer[left];
        }
        else {
            showStack();
            throw new StackException("Left stack is underflow");
        }
    }

    public int popR() throws StackException {
        if (!isEmptyR()) {
            right++;
            return buffer[right];
        }
        else {
            showStack();
            throw new StackException("Right stack is underflow");
        }
    }

    public void showStack() {
        System.out.print("left top: ");  System.out.print(left);
        System.out.print(", right top: ");  System.out.print(right);
        System.out.print(", stack: ");
        System.out.println(Arrays.toString(buffer));
    }
}