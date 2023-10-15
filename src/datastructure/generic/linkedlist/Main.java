package datastructure.generic.linkedlist;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rand = new Random(0);
        for (int i = 0; i < 10; i++) {
            Integer randomNumber = rand.nextInt(1, 100);
            if (i % 2 == 0) {
                ll.pushHead(randomNumber);
            } else {
                ll.pushTail(randomNumber);
            }
        }

        LinkedList<String> llString = new LinkedList<>();
        String[] listName = { "Rizky", "Siti", "Bambang", "Ayu", "Adi", "Wulan", "Tegar", "Diah", "Eko", "Nia" };
        for (int i = 0; i < listName.length;) {
            llString.pushHead(listName[i++]);
            llString.pushTail(listName[i++]);
        }
    }
}
