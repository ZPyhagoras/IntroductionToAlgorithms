import java.util.Arrays;

public class P_10_1_5 {
    private int[] buffer;
    private int front, rear;
    private int size;

    public P_10_1_5(int n) {
        size = n;
        front = rear = 0;
        buffer = new int[n];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return front == (rear + 1) % size;
    }

    public void pushFront(int x) {
        if (!isFull()) {
            front = (front - 1 + size) % size;
            buffer[front] = x;
        }
        else {
            System.out.println("push front error");
        }
    }

    public void pushRear(int x) {
        if (!isFull()) {
            buffer[rear] = x;
            rear = (rear + 1) % size;
        }
        else {
            System.out.println("push rear error");
        }
    }

    public int popFront() {
        if (!isEmpty()) {
            int x = buffer[front];
            buffer[front] = 0;
            front = (front + 1) % size;
            return x;
        }
        else {
            System.out.println("pop front error");
            return Integer.MIN_VALUE;
        }
    }

    public int popRear() {
        if (!isEmpty()) {
            rear = (rear - 1 + size) % size;
            int x = buffer[rear];
            buffer[rear] = 0;
            return x;
        }
        else {
            System.out.println("pop rear error");
            return Integer.MIN_VALUE;
        }
    }

    public void showDeque() {
        System.out.print("front: ");  System.out.print(front);
        System.out.print(", rear: ");  System.out.print(rear);
        System.out.print(", deque: ");
        System.out.println(Arrays.toString(buffer));
    }
}