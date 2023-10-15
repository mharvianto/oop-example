package datastructure.linkedlist;

public class LinkedList {
    // inner class
    private class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
            prev = next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList() {
        head = tail = null;
    }

    /**
     * Mengembalikan nilai dari simpul pada indeks tertentu dalam LinkedList ini.
     * 
     * <p>
     * Metode ini menelusuri LinkedList dari kepala (awal) daftar hingga
     * indeks yang ditentukan atau hingga akhir daftar. Metode ini mengembalikan
     * nilai dari simpul jika ada,
     * jika tidak, akan melemparkan pengecualian.
     * </p>
     *
     * @param index indeks dari simpul yang nilainya ingin diambil
     * @return nilai dari simpul pada indeks yang ditentukan
     * @throws Exception jika indeks yang ditentukan berada di luar jangkauan
     *                   {@code (index < 0 atau index >= size())}
     */
    public int get(int index) {
        Node curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            throw new IllegalArgumentException("Index out of bound.");
        }
        return curr.value;
    }

    public void pushHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void pushTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
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
        if (tail == null)
            return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
