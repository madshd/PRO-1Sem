package ex2;

import java.util.ArrayList;

public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;
    // association 0..1 --> 0..* Swimmer
    private final ArrayList<Swimmer> swimmers = new ArrayList<>();
    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public ArrayList<Swimmer> getSwimmers() {
        return new ArrayList<>(swimmers);
    }
    public void addSwimmers(Swimmer swimmer) {
        swimmers.add(swimmer);
    }

    public void removeSwimmers(Swimmer swimmer) {
        swimmers.remove(swimmer);
    }
    public char getLevel() {
        return level;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    @Override
    public String toString() {
        return getLevel() +
                " | Swimmers: " + swimmers +
                '}';
    }

}
