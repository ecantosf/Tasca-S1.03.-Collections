package capitalgame.sp1ta1le1ex3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class CapitalGame {
    private HashMap<String, String> countryCapitalMap;
    private Scanner scanner;
    private int score;
    private String name;
    private final int TOTAL_ROUNDS = 10;

    public CapitalGame() {
        this.countryCapitalMap = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.score = 0;
        this.name = "";
    }

    public HashMap<String, String> getCountryCapitalMap() {
        return countryCapitalMap;
    }

    public boolean loadCountriesData() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("countries.txt"));

            for (String line : lines) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",", 2);

                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();

                    if (!country.isEmpty() && !capital.isEmpty()) {
                        countryCapitalMap.put(country, capital);
                    }
                }
            }

            System.out.println("Successfully loaded " + countryCapitalMap.size() + " countries.");
            return true;

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false;
        }
    }

    public void startGame() {
        System.out.println("=== Welcome to the Capital Game!");

        name = askUserName();

        System.out.println("\nHello, " + name + "! Let's begin the quiz.");
        System.out.println("You will be asked " + TOTAL_ROUNDS + " questions about country capitals.");

        score = playQuiz();

        saveScoreToFile(name, score);

        scanner.close();
    }

    private String askUserName() {
        String userName = "";

        while (userName.trim().isEmpty()) {
            System.out.print("\nPlease enter your name: ");
            userName = scanner.nextLine().trim();

            if (userName.isEmpty()) {
                System.out.println("Name cannot be empty. Please try again.");
            }
        }

        return userName;
    }

    private int playQuiz() {
        List<String> selectedCountries = getRandomCountries(TOTAL_ROUNDS);

        for (int i = 0; i < selectedCountries.size(); i++) {
            String country = selectedCountries.get(i);

            boolean isCorrect = askQuestion(country);

            if (isCorrect) {
                score++;
                System.out.println("Correct! Your current score: " + score + "/" + (i + 1));
            } else {
                System.out.println("Incorrect!");
                System.out.println("Current score: " + score + "/" + (i + 1));
            }
        }

        return score;
    }

    private List<String> getRandomCountries(int numberOfCountries) {
        List<String> allCountries = new ArrayList<>(countryCapitalMap.keySet());

        Collections.shuffle(allCountries);

        return new ArrayList<>(allCountries.subList(0, numberOfCountries));
    }

    private boolean askQuestion(String country) {
        System.out.print("What is the capital of " + country + "? ");

        String userAnswer = scanner.nextLine().trim();

        String correctCapital = countryCapitalMap.get(country);

        if (correctCapital == null) {
            System.err.println("Error: Country '" + country + "' not found in map!");
            return false;
        }

        return userAnswer.equalsIgnoreCase(correctCapital);
    }
    private void saveScoreToFile(String name, int score) {
        try {
            FileWriter fileWriter = new FileWriter("classificacio.txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(name + ": " + score + "/" + TOTAL_ROUNDS);
            writer.newLine();

            writer.close();
            System.out.println("\nScore saved to classificacio.txt");

        } catch (IOException e) {
            System.err.println("Error saving score: " + e.getMessage());
        }
    }

}
