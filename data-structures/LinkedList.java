public class LinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node addAtFront(int val, Node head) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    static void addAtNthIndex(int val, int n, Node head) {
        Node newNode = new Node(val);
        while (n-- > 1) {
            head = head.next;
        }
        Node next = head.next;
        head.next = newNode;
        newNode.next = next;
    }

    static void addAtEnd(int val, Node head) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(val);
    }

    static Node deleteAtFront(Node head) {
        return head.next;
    }

    static void deleteAtNthIndex(int n, Node head) {
        while (n-- > 1) {
            head = head.next;
        }
        head.next = head.next.next;
    }

    static void deleteAtEnd(Node head) {
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        /*
        * list of methods implemented on singly linked list
        * 1. add at front X
        * 2. add at nth index X
        * 3. add at end X
        * 4. delete at front X
        * 5. delete at nth index X
        * 6. delete at end X
        * 7. print list X
        * */
        // driver code to check whether the methods are working properly or not
        Node head = new Node(1);
        head = addAtFront(123, head);
        addAtNthIndex(321, 1, head);
        addAtEnd(1234, head);
        head = deleteAtFront(head);
        deleteAtNthIndex(1, head);
        deleteAtEnd(head);
        printList(head);
    }
}
