package duplicate.sp1ta3le1ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

    public static void testMonthArrayList() {
        String [] monthNames = {
                "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Setembre", "Octubre", "Novembre", "Desembre"
        };

        List months = new ArrayList();

        for (String monthName : monthNames) {
            months.add(monthName);
        }

        System.out.println("1. ArrayList Inicial (sense 'Agost'):");

        for (Object month : months) {
            System.out.print(month + " ");
        }

        System.out.println("\n\n2. ArrayList Final (amb 'Agost' a posició de l'any):");

        months.add(7,"Agost");


        for (Object month : months) {
            System.out.print(month + " ");
        }
        System.out.println("\nAmb ArrayList 'Agost' apareix en posició correcta i elements estan ordenats.");
    }

    public static void iteratorArrayList() {
        String [] monthNames = {
                "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Setembre", "Octubre", "Novembre", "Desembre"
        };

        List months = new ArrayList();

        for (String monthName : monthNames) {
            months.add(monthName);
        }

        months.add(7, "Agost");

        System.out.println("\n4. Recorrent l'ArrayList amb Iterator:");
        Iterator it = months.iterator();

        while (it.hasNext()) {
            Object month = it.next();
            System.out.print(month + " ");
        }

    }
}