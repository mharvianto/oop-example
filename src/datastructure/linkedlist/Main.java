package datastructure.linkedlist;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(1, 100);
            if (i % 2 == 0) {
                ll.pushHead(randomNumber);
            } else {
                ll.pushTail(randomNumber);
            }
        }
        // runtime error, must be handle with try-cacth
        int value = ll.get(11);
        System.out.println(value);
    }
}
