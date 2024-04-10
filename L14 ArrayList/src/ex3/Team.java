package ex3;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void printPlayers() {
        for (int i = 0; i < players.size(); i++) {
            players.get(i);
            System.out.println(players.get(i));
        }
    }
    public double calcAverageAge() {
        int totalAge = 0;
        for (Player player : players) {
            totalAge += player.getAge();
        }
        if (players.size() > 0) {
            return (double) totalAge / players.size();
        } else {
            return 0; // To handle division by zero when there are no players
        }
    }

    public int calcTotalScore() {
        int totalScore = 0;
        for (Player player : players) {
            totalScore += player.getScore(); // Use 'player.getScore()' instead of 'Player.getScore()'
        }
        return totalScore;
    }

    public int calcOldPlayersScore(int ageLimit) {
        int totalOldScore = 0;
        for (Player player : players) {
            if (player.getAge() > ageLimit) {
                totalOldScore += player.getScore(); // Use 'player.getScore()' instead of 'Player.getScore()'
            }
        }
        return totalOldScore;
    }


    public int maxScore() {
        // Variable to hold the maximum score
        int maxScore = Integer.MIN_VALUE;

        // Loop through each player in the 'players' ArrayList
        for (Player player : players) {
            // Check if the score of the current player is greater than the current maximum score
            if (player.getScore() > maxScore) {
                // If the score of the current player is greater, update the maximum score
                maxScore = player.getScore();
            }
        }

        // Return the maximum score
        return maxScore;
    }

    public ArrayList<String> bestPlayerNames() {
        // Variable to hold the highest score found among all players
        int highestScore = maxScore();

        // ArrayList to store names of players with the highest score
        ArrayList<String> bestPlayers = new ArrayList<>();

        // Loop through each player in the 'players' ArrayList
        for (Player player : players) {
            // Check if the player's score is equal to the highest score
            if (player.getScore() == highestScore) {
                // If the score matches, add the player's name to the 'bestPlayers' ArrayList
                bestPlayers.add(player.getName());
            }
        }

        // Return the ArrayList containing names of players with the highest score
        return bestPlayers;
    }


    @Override
    public String toString() {
        return "Team " +
                " Name " + name + '\'' +
                " | " + players + " ";
    }
}
