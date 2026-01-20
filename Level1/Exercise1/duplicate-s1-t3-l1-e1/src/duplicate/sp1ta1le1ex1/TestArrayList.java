package duplicate.sp1ta1le1ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

    public static void testMonthArrayList() {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "September", "October", "November", "December"
        };

        List<Month> months = new ArrayList<>();

        for (String monthName : monthNames) {
            months.add(new Month(monthName));
        }

        System.out.println("1. Initial ArrayList (without 'August'):");
        for (Month month : months) {
            System.out.print(month + " ");
        }

        System.out.println("\n\n2. Final ArrayList (with 'August' in correct position):");
        months.add(7, new Month("August"));

        for (Month month : months) {
            System.out.print(month + " ");
        }
        System.out.println("\nWith ArrayList 'August' appears in correct position and elements are ordered.");
    }

    public static void iteratorArrayList() {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "September", "October", "November", "December"
        };

        List<Month> months = new ArrayList<>();

        for (String monthName : monthNames) {
            months.add(new Month(monthName));
        }

        months.add(7, new Month("August"));

        System.out.println("\n4. Traversing ArrayList with Iterator:");
        Iterator<Month> it = months.iterator();

        while (it.hasNext()) {
            Month month = it.next();
            System.out.print(month + " ");
        }
        System.out.println();
    }
}