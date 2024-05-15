package demosorting;

public class Player implements Comparable<Player> {
    private final String name;
    private final int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + "-" + score;
    }

    @Override
    // Giver muligheden for at benytte sig af .sort();
    public int compareTo(Player other) {
        // Ib.CompareTo(Hans), vil sige this.score er Ib og other.score er Hans
        return Integer.compare(this.score, other.score);
    }
}
