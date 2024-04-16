package ex4;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private String title;
    private ArrayList<String> cast = new ArrayList<>();
    private final ArrayList<Episodes> episodes = new ArrayList<>();

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }
    public ArrayList<Episodes> getEpisodes() {
        return new ArrayList<>(episodes);
    }
    public void addEpisodes(Episodes episodes) {
        episodes.add(episodes);
    }
    /**
     * Return the total length (in minutes) of all the
     * episodes in the series.
     */
    public int totalLength() {
        int totalLengthMin = 0;
        for (Episodes episode : episodes) {
            totalLengthMin += episode.getLengthMinutes();
        }
        return totalLengthMin;
    }
    /** Return the total list of all guest actors from all episodes.*/
    public ArrayList<String> getGuestActors() {
        ArrayList<String> guestActors = new ArrayList<>();
        for (int i = 0; i < episodes.size(); i++) {
            episodes.get(i).getGuestActors();
            guestActors.add(String.valueOf(i));
        }
        return guestActors;
    }
}
