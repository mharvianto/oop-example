package datastructure.generic.tree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Random rand = new Random(0);
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(1, 100);
            bst.push(randomNumber);
            System.out.println(randomNumber);
        }

        Integer number = bst.search(12);
        if (number == null) {
            System.out.println("Not found");
        } else {
            System.out.println("Found");
        }
    }
}
