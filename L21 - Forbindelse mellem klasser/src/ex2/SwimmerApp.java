package ex2;

import ex2.TrainingPlan;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp {

    public static void main(String[] args) {
        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        TrainingPlan a = new TrainingPlan('A', 16, 10);
        a.addSwimmers(jan);
        jan.setTrainingPlan(a);
        a.addSwimmers(bo);
        bo.setTrainingPlan(a);
        TrainingPlan b = new TrainingPlan('B', 10, 6);
        b.addSwimmers(mikkel);
        mikkel.setTrainingPlan(b);
        ArrayList<TrainingPlan> trainingPlans = new ArrayList<>();
        trainingPlans.add(a);
        trainingPlans.add(b);

        System.out.println(trainingPlans.toString());
    }


}
