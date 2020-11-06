
package queue;
public class Queue {
    private static class Node {// criação do nó/numero
        private int date;
        private Node next;
        private Node(int valor) {
            this.date = valor;
        }
    }
    private static Node head;
    private static Node tail;
    public static void add(int valor) {//add valores na cauda add in the tail
        Node node = new Node(valor);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }
    public static int remove() {//remove a cabeça remobe the tail
        int valor = head.date;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return valor;
    }
    public boolean empety() {
        return head == null;
    }
    public int peek() {
        return head.date;
    }
    public static void show() {
        Node current = head;
        while (current.next != null) {
            System.out.println("" + current.date);
            current = current.next;
        }
        System.out.println("" + current.date);
    }

    public static void main(String[] args) {
        //how to use
        add(5);
        add(14);
        add(456);
        add(65);
        add(2);
        add(8);
        add(55);
        add(2);
        remove();
        remove();
        show();
    }

}
