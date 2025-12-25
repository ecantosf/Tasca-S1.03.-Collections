package capitalgame.sp1ta1le1ex3;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CapitalGame game = new CapitalGame();

        game.loadCountriesData();

        game.startGame();

    }
}
