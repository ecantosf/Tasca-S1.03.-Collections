package listiterator.sp1ta1le1ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();

        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(5);
        originalList.add(8);
        originalList.add(13);

        System.out.println("Original List: " + originalList);

        List<Integer> reversedList = new ArrayList<>();

        ListIterator<Integer> it =  originalList.listIterator(originalList.size());

        while ((it.hasPrevious())){
            Integer element = it.previous();
            reversedList.add(element);
        }

        System.out.println("Reverse List: " + reversedList);
    }
}
