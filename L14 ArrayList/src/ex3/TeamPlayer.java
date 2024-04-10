package ex3;

public class TeamPlayer {
    public static void main(String[] args) {
//        Constructor for Team klassen, med arraylisten Players
        Team t1 = new Team("HIK");
//        Constructor med selve spiller klassen, som tilføjes til ovenstående arraylist.
        Player p1 = new Player("Mads Dueholm", 25);
        Player p2 = new Player("Hans Hansen", 30);
        Player p3 = new Player("Mads Madsen", 40);
        Player p4 = new Player("Jens Jensen", 31);
//      Metoden fra Team klassen, hvoraf man tilføjer den nyoprettede player til arraylisten.
        t1.addPlayer(p1);
        p1.setScore(30);
        t1.addPlayer(p2);
        p2.setScore(20);
        t1.addPlayer(p3);
        p3.setScore(50);
        t1.addPlayer(p4);
        p4.setScore(10);

        t1.printPlayers();
        // Test all the methods
        System.out.println("Team Name: " + t1.getName());
        System.out.println("Team Players: " + t1.getPlayers());
        System.out.println("Average Age: " + t1.calcAverageAge());
        System.out.println("Total Score: " + t1.calcTotalScore());
        System.out.println("Total Score of Players Older than 25: " + t1.calcOldPlayersScore(25));
        System.out.println("Max Score: " + t1.maxScore());
        System.out.println("Best Player Names: " + t1.bestPlayerNames());

    }
}
