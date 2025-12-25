package hashSetorder.sp1ta3le2ex12;

import java.util.*;

public class TestComparable {

    public static void testComparable() {
        System.out.println("\nTest d'ordenació amb Comparable:");

        List<Restaurant> restaurants = Arrays.asList(
                new Restaurant("Restaurant B", 8),
                new Restaurant("Restaurant A", 7),
                new Restaurant("Restaurant A", 9),
                new Restaurant("Restaurant C", 5),
                new Restaurant("Restaurant B", 10),
                new Restaurant("La Piazza", 8),
                new Restaurant("La Piazza", 9),
                new Restaurant("El Asador", 7),
                new Restaurant("El Asador", 6)
        );

        System.out.println("\n1. Llista original (desordenada):");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }

        List<Restaurant> sortedList = new ArrayList<>(restaurants);
        Collections.sort(sortedList);

        System.out.println("\n2. Llista ordenada amb Comparable:");
        System.out.println("(Ordre alfabètic per nom i puntuació descendent si mateix nom)");
        for (Restaurant r : sortedList) {
            System.out.println(r);
        }

        System.out.println("\n3. TreeSet (ordre automàtic i sense duplicats):");
        Set<Restaurant> treeSet = new TreeSet<>(restaurants);
        for (Restaurant r : treeSet) {
            System.out.println(r);
        }

        System.out.println("\n4. Exemple de l'enunciat:");
        List<Restaurant> ejemplo = Arrays.asList(
                new Restaurant("Restaurant A", 7),
                new Restaurant("Restaurant A", 9),
                new Restaurant("Restaurant B", 8)
        );

        Collections.sort(ejemplo);
        System.out.println("Ordre esperat:");
        System.out.println("Restaurant A, puntuació: 9");
        System.out.println("Restaurant A, puntuació: 7");
        System.out.println("Restaurant B, puntuació: 8");

        System.out.println("\nOrdere obtingut:");
        for (Restaurant r : ejemplo) {
            System.out.println("nom: " + r.getName() + ", puntuació: " + r.getScore());
        }
    }
}
