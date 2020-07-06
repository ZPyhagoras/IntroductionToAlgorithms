public class Main {
    public static void main(String[] args) throws StackException {
        P_10_1_5 deque = new P_10_1_5(5);
        deque.showDeque();

        deque.pushRear(1);
        deque.showDeque();

        deque.pushFront(2);
        deque.showDeque();
        
        deque.pushRear(3);
        deque.showDeque();

        deque.popFront();
        deque.showDeque();

        deque.pushFront(4);
        deque.showDeque();

        deque.popRear();
        deque.showDeque();
    }
}