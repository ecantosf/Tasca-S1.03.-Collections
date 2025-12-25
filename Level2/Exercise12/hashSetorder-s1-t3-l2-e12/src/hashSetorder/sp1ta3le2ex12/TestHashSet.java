package hashSetorder.sp1ta3le2ex12;

import java.util.Objects;
import java.util.*;

public class TestHashSet {

    public static void testHashSet()
    {
        HashSet<Restaurant> restaurants = new HashSet<>();

        System.out.println("Test de HashSet sense duplicats exactes:\n");

        System.out.println("1. Restaurant amb mateix nom i diferent puntuació:");

        Restaurant r1 = new Restaurant("La Piazza", 8);
        Restaurant r2 = new Restaurant("La Piazza", 9);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("\n2. Afegir Restaurant amb mateix nom i puntuació:");

        Restaurant r3 = new Restaurant("La Piazza", 8);

        System.out.println(r3);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);

        System.out.println("Número de restaurants únics: " + restaurants.size());
        System.out.println("Contingut: " + restaurants);
    }

}
