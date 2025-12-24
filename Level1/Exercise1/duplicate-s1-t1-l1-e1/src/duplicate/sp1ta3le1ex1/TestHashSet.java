package duplicate.sp1ta3le1ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void testMonthHashSet(){
        String [] monthNames = {
                "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Setembre", "Octubre", "Novembre", "Desembre"
        };

        Set<String> monthsHA = new HashSet<>();

        for (String monthNameHA : monthNames) {
            monthsHA.add(monthNameHA);
        }

        monthsHA.add("Agost");
        monthsHA.add("Agost");

        System.out.println("\n3. HashSet amb 'Agost' repetit:");

        for (Object monthHA : monthsHA) {
            System.out.print(monthHA + " ");
        }

        System.out.println("\nAmb HashSet 'Agost' no apareix repetit i elements estan desordenats.");

    }
    public static void iteratorHashSet() {
        String [] monthNames = {
                "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Setembre", "Octubre", "Novembre", "Desembre"
        };

        Set<String> monthsHA = new HashSet<>();

        for (String monthNameHA : monthNames) {
            monthsHA.add(monthNameHA);
        }

        monthsHA.add("Agost");
        monthsHA.add("Agost");

        System.out.println("\n\n5. Recorrent el HashSet amb Iterator:");
        Iterator it = monthsHA.iterator();

        while (it.hasNext()) {
            Object month = it.next();
            System.out.print(month + " ");
        }

    }
}
