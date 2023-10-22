public class StackWithLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static void printStack() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void push(int val) {
        size++;
        Node newTop = new Node(val);
        newTop.next = top;
        top = newTop;
    }

    static void pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        } else if (size == 1) {
            top = null;
        } else {
            top = top.next;
        }
        size--;
    }

    static void stackSize() {
        System.out.println("Stack size is " + size);
    }

    static Node top = null;
    static int size = 0;

    public static void main(String[] args) {
        /*
        * 1. print stack
        * 2. push to stack
        * 3. pop from stack
        * 4. print size of stack
        * */

        // driver code to test the above methods
        push(1);
        push(2);
        push(3);
        printStack();
        pop();
        printStack();
        stackSize(); // stack size = 2
        pop(); pop();
        printStack(); // stack is empty
        pop(); // stack is empty
    }
}
