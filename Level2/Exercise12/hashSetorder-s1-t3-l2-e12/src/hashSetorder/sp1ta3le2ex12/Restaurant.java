package hashSetorder.sp1ta3le2ex12;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // MÉTODO compareTo() REQUERIDO por la interfaz Comparable
    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);

        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(other.score, this.score);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}