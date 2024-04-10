package ex2;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;
    private TrainingPlan trainingPlan;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /** Note: Nullable param group. */
    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    /** Return the fastest lap time. */
    public double bestLapTime() {
        double low = 999;
        for (int i = 0; i < lapTimes.size(); i++) {
            if (getLapTimes().get(i) < low) {
                low = getLapTimes().get(i);
            }
        }
        return low;
    }

    public int allTrainingHours() {
        /**
         * Return how many training hours the swimmer has each week.
         */
        int totalTrainingHours = trainingPlan.getWeeklyStrengthHours() + trainingPlan.getWeeklyWaterHours();

        return totalTrainingHours;
    }

    @Override
    public String toString() {
        return name + " | " +
                " Trainingplan: " + trainingPlan.getLevel() +
                " | Weekly hours:" + allTrainingHours() +
                ']';
    }
}
