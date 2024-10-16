package DSA.Data_Structure.LinkedList;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size;

    public static void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public static int deleteAtHead() {
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static int deleteAtTail() {
        int val;
        if (head == tail) {
            val = head.data;
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            val = tail.data;
            tail = temp;
            tail.next = null;
        }
        size--;
        return val;
    }

    public static void insertNode(int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 0) {
            head = tail = newNode;
        } else {
            Node temp = head;
            while (--pos != 0) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public static int deleteNode(int pos) {
        int val;
        if (pos == 0) {
            val = deleteAtHead();
        } else {
            Node temp = head;
            while (--pos != 0) {
                temp = temp.next;
            }
            val = temp.next.data;
            temp.next = temp.next.next;
        }
        size--;
        return val;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null \nSize=" + size);
    }

    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
        insertAtTail(6);
        insertAtTail(7);
        insertAtTail(8);
        insertAtTail(9);
        insertAtTail(10);
        insertAtTail(12);
        insertAtHead(5);

        insertNode(2, 2);
        display();

        System.out.println("tail = " + tail.data);
        System.out.println("head = " + head.data);


        System.out.println();

        int val1 = deleteAtHead();
        System.out.println("\nremoved " + val1);
        display();

        int val2 = deleteAtTail();
        System.out.println("\nremoved " + val2);
        display();

        int val3 = deleteNode(2);
        System.out.println("\nremoved " + val3);
        display();
    }
}
