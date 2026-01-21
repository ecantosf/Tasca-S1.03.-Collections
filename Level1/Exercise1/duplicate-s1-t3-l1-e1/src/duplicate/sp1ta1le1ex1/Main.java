package duplicate.sp1ta1le1ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ArrayList Tests ===");
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

        System.out.println("\n4. Traversing ArrayList with Iterator:");
        Iterator<Month> itArrayList = months.iterator();
        while (itArrayList.hasNext()) {
            Month month = itArrayList.next();
            System.out.print(month + " ");
        }
        System.out.println();

        System.out.println("\n=== HashSet Tests ===");
        Set<Month> monthsHA = new HashSet<>();

        for (String monthNameHA : monthNames) {
            monthsHA.add(new Month(monthNameHA));
        }

        monthsHA.add(new Month("August"));
        monthsHA.add(new Month("August"));  // This won't be added because it's a duplicate

        System.out.println("3. HashSet with 'August' repeated:");
        for (Month monthHA : monthsHA) {
            System.out.print(monthHA + " ");
        }

        System.out.println("\nWith HashSet 'August' doesn't appear repeated and elements are unordered.");

        System.out.println("\n5. Traversing HashSet with Iterator:");
        Iterator<Month> itHashSet = monthsHA.iterator();
        while (itHashSet.hasNext()) {
            Month month = itHashSet.next();
            System.out.print(month + " ");
        }
    }
}
