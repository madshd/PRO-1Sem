package ex1;

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
        lapTimesMikkel.addAll(List.of(1.03, 1.0, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);

        TrainingPlan tp1 = new TrainingPlan('A', 16, 10);
        jan.setTrainingPlan(tp1);
        bo.setTrainingPlan(tp1);
        TrainingPlan tp2 = new TrainingPlan('B', 10, 7);
        mikkel.setTrainingPlan(tp2);

        int hourCount = 0;

        for (Swimmer s : swimmers) {
                hourCount += s.allTrainingHours();
            if (s.getTrainingPlan() != null) {
                System.out.println("Navn: " + s.getName() + " \n Best laptime: " + s.bestLapTime()
                        + " \n Ugentligt antal træningstimer: " + s.allTrainingHours()
                );
            }
        }
        System.out.println("\n Total antal træningstimer: " + hourCount);
    }
}
