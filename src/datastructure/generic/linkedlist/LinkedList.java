package datastructure.generic.linkedlist;

public class LinkedList<T> {
    private class Node<T1> {
        private T1 value;
        private Node<T1> prev;
        private Node<T1> next;

        public Node(T1 value) {
            this.value = value;
            next = prev = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        head = tail = null;
    }

    public T get(int index) {
        Node<T> curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null)
            throw new IllegalArgumentException("Index out of bound");
        return curr.value;
    }

    public void pushHead(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void pushTail(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void popHead() {
        if (head == null)
            return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void popTail() {
        if (head == null)
            return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
