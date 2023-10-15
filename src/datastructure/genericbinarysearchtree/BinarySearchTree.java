package datastructure.genericbinarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {
    private class Node<T1> {
        private T1 value;
        private Node<T1> left;
        private Node<T1> right;

        public Node(T1 value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void push(T value) {
        this.root = push(this.root, value);
    }

    private Node<T> push(Node<T> curr, T value) {
        if (curr == null) {
            return new Node<>(value);
        } else {
            if (value.compareTo(curr.value) == 0) {
                throw new IllegalArgumentException("Duplicate object");
            } else if (value.compareTo(curr.value) < 0) {
                curr.left = push(curr.left, value);
            } else {
                curr.right = push(curr.right, value);
            }
            return curr;
        }
    }

    public T search(T value) {
        return search(root, value);
    }

    private T search(Node<T> curr, T value) {
        if (curr == null)
            return null;
        if (value.compareTo(curr.value) == 0) {
            return curr.value;
        } else if (value.compareTo(curr.value) < 0) {
            return search(curr.left, value);
        } else {
            return search(curr.right, value);
        }
    }
}
