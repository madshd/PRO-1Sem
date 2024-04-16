package ex4;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Jennifer Aniston");
        cast.add("Lisa Kudrow");
        cast.add("David Schwimmer");
        cast.add("Matthew Perry");
        cast.add("Courteney Cox");
        cast.add("Matt LeBlanc");
        Series friendss1 = new Series("Friends S1", cast);
        ArrayList<String> fs1GuestActors = new ArrayList<>();
        fs1GuestActors.add("Paul Rudd");
        fs1GuestActors.add("Tom Selleck");
        fs1GuestActors.add("Maggie Wheeler");
        Episodes fsS1Episodes = new Episodes(1,fs1GuestActors,587);
        Episodes fsS2Episodes = new Episodes(2, fs1GuestActors, 566);

        friendss1.addEpisodes(fsS1Episodes);
        friendss1.addEpisodes(fsS2Episodes);

        System.out.println(friendss1.totalLength());
    }
}
