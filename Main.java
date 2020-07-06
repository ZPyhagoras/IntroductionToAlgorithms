public class Main {
    public static void main(String[] args) throws StackException {
        P_10_1_2 DStack = new P_10_1_2(5);
        DStack.showStack();
        DStack.pushL(1);
        DStack.showStack();
        DStack.pushR(2);
        DStack.showStack();
        DStack.pushR(3);
        DStack.showStack();
        DStack.popL();
        DStack.showStack();
        DStack.pushL(4);
        DStack.showStack();
        DStack.pushR(5);
        DStack.showStack();
        DStack.pushR(6);
        DStack.showStack();
        DStack.pushL(7);
        DStack.showStack();
    }
}