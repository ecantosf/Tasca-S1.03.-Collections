package duplicate.sp1ta1le1ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

    public static void testMonthHashSet() {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "September", "October", "November", "December"
        };

        Set<Month> monthsHA = new HashSet<>();

        for (String monthNameHA : monthNames) {
            monthsHA.add(new Month(monthNameHA));
        }

        monthsHA.add(new Month("August"));
        monthsHA.add(new Month("August"));  // This won't be added because it's a duplicate

        System.out.println("\n3. HashSet with 'August' repeated:");
        for (Month monthHA : monthsHA) {
            System.out.print(monthHA + " ");
        }

        System.out.println("\nWith HashSet 'August' doesn't appear repeated and elements are unordered.");
    }

    public static void iteratorHashSet() {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "September", "October", "November", "December"
        };

        Set<Month> monthsHA = new HashSet<>();

        for (String monthNameHA : monthNames) {
            monthsHA.add(new Month(monthNameHA));
        }

        monthsHA.add(new Month("August"));
        monthsHA.add(new Month("August"));  // Duplicate

        System.out.println("\n\n5. Traversing HashSet with Iterator:");
        Iterator<Month> it = monthsHA.iterator();

        while (it.hasNext()) {
            Month month = it.next();
            System.out.print(month + " ");
        }
        System.out.println();
    }
}