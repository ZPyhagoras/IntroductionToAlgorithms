import java.util.Stack;

public class P_10_1_6 {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public P_10_1_6() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int value) {
        inStack.push(value);
    }
    
    public int pop() {
        if (!outStack.empty()) {
            return outStack.pop();
        }
        else {
            while (!inStack.empty()) {
                outStack.push(inStack.pop());
            }
            return outStack.empty() ? -1 : outStack.pop();
        }
    }

    public int peek() {
        if (!outStack.empty()) {
            return outStack.peek();
        }
        else {
            while (!inStack.empty()) {
                outStack.push(inStack.pop());
            }
            return outStack.empty() ? -1 : outStack.peek();
        }
    }

    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }
}