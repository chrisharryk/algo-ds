public class DoublyLinkedList {
    static class Node {
        int val;
        Node next, prev;
        Node(int val) {
            this.val = val;
            this.next = this.prev = null;
        }
    }

    static void printFromHeadToTail(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void printFromTailToHead(Node tail) {
        while (tail != null) {
            System.out.print(tail.val + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    static Node addAtHead(int val, Node head) {
        Node newHead = new Node(val);
        head.prev = newHead;
        newHead.next = head;
        return newHead;
    }

    static Node addAtTail(int val, Node tail) {
        Node newTail = new Node(val);
        tail.next = newTail;
        newTail.prev = tail;
        return newTail;
    }

    static void addAtNthIndexFromHead(int val, int n, Node head) {
        while (n-- > 1) {
            head = head.next;
        }
        Node next = head.next;
        Node newNode = new Node(val);
        head.next = newNode;
        next.prev = newNode;
        newNode.prev = head;
        newNode.next = next;
    }

    static void addAtNthIndexFromTail(int val, int n, Node tail) {
        while (n-- > 1) {
            tail = tail.prev;
        }
        Node prev = tail.prev;
        Node newNode = new Node(val);
        prev.next = newNode;
        tail.prev = newNode;
        newNode.next = tail;
        newNode.prev = prev;
    }

    static Node deleteAtHead(Node head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    static Node deleteAtTail(Node tail) {
        tail = tail.prev;
        tail.next = null;
        return tail;
    }

    static void deleteAtNthIndexFromHead(int n, Node head) {
        while (n-- > 1) {
            head = head.next;
        }
        Node newNext = head.next.next;
        head.next = newNext;
        newNext.prev = head;
    }

    static void deleteAtNthIndexFromTail(int n, Node tail) {
        while (n-- > 1) {
            tail = tail.next;
        }
        Node newPrev = tail.prev.prev;
        tail.prev = newPrev;
        newPrev.next = tail;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node tail = head;

        /*
        * 1. add at head X
        * 2. add at tail X
        * 3. add at nth index from head X
        * 4. add at nth index from tail X
        * 5. delete at head X
        * 6. delete at tail X
        * 7. delete at nth index from head X
        * 8. delete at nth index from tail X
        * 9. print from head to tail X
        * 10. print from tail to head X
        * */

        // driver code to test the above methods
        head = addAtHead(111, head);
        tail = addAtTail(222, tail);
        addAtNthIndexFromHead(123, 1, head);
        addAtNthIndexFromHead(234, 2, head);
        addAtNthIndexFromTail(321, 1, tail);
        addAtNthIndexFromTail(432, 2, tail);
        head = deleteAtHead(head);
        tail = deleteAtTail(tail);
        deleteAtNthIndexFromHead(1, head);
        deleteAtNthIndexFromTail(1, tail);
        printFromHeadToTail(head);
        printFromTailToHead(tail);
    }
}
