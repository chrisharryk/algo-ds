public class LinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node addAtHead(int val, Node head) {
        Node newHead = new Node(val);
        newHead.next = head;
        return newHead;
    }

    static void addAtNthIndex(int n, int val, Node head) {
        while (n-- > 1) {
            head = head.next;
        }
        Node newNode = new Node(val);
        Node next = head.next;
        head.next = newNode;
        newNode.next = next;
    }

    static void addAtEnd(int val, Node head) {
        Node newNode = new Node(val);
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }

    static Node deleteAtHead(Node head) {
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
        Node head = new Node(1);
        /*
        * 1. add at head X
        * 2. add at nth index X
        * 3. add at end X
        * 4. delete at head X
        * 5. delete at nth index X
        * 6. delete at end
        * 7. print list
        * */
        // driver code to test the above methods
        head = addAtHead(111, head);
        addAtNthIndex(1, 123, head);
        addAtEnd(321, head);
        head = deleteAtHead(head);
        deleteAtNthIndex(1, head);
        deleteAtEnd(head);
        printList(head);
    }
}
