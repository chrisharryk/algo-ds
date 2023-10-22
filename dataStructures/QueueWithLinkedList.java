public class QueueWithLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static void push(int val) {
        size++;
        Node newFront = new Node(val);
        if (size == 0) {
            front = newFront;
            return;
        }
        newFront.next = front;
        front = newFront;
    }

    static void pop() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        } else if (size == 1) {
            front = null;
        } else {
            front = front.next;
        }
        size--;
    }

    static void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node front = null;
    static int size = 0;

    public static void main(String[] args) {
        /*
        * 1. print queue
        * 2. push to queue
        * 3. pop from queue
        * 4. queue size
        * */

        // driver code to test the above methods
        push(1); push(2); push(3);
        printQueue();
        pop(); pop(); pop(); pop();
        printQueue();
    }
}
