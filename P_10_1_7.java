import java.util.LinkedList;
import java.util.Queue;

public class P_10_1_7 {
    private Queue<Integer> dataQueue;
    private Queue<Integer> helpQueue;

    public P_10_1_7() {
        dataQueue = new LinkedList<>();
        helpQueue = new LinkedList<>();        
    }

    public void push(int x) {
        if (dataQueue.isEmpty()) {
            dataQueue.add(x);
        }
        else {
            helpQueue.add(x);
            while (!dataQueue.isEmpty()) {
                helpQueue.add(dataQueue.remove());
            }
            while (!helpQueue.isEmpty()) {
                dataQueue.add(helpQueue.remove());
            }
        }
        
    }

    public int pop() {
        return dataQueue.remove();
    }

    public int top() {
        return dataQueue.peek();
    }
    
    public boolean empty() {
        return dataQueue.isEmpty();
    }
}