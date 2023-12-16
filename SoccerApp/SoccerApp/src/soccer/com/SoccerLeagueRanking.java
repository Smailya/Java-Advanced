package soccer.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SoccerLeagueRanking {
    public static void main(String[] args) {
        Map<String, Integer> teamPoints = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("soccer_results.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String[] teamScores1 = parts[0].split(" ");
                String[] teamScores2 = parts[1].split(" ");
                String team1 = getTeamName(teamScores1);
                String team2 = getTeamName(teamScores2);
                int score1 = Integer.parseInt(teamScores1[teamScores1.length - 1]);
                int score2 = Integer.parseInt(teamScores2[teamScores2.length - 1]);

                if (score1 > score2) {
                    updatePoints(teamPoints, team1, 3);
                } else if (score1 < score2) {
                    updatePoints(teamPoints, team2, 3);
                } else {
                    updatePoints(teamPoints, team1, 1);
                    updatePoints(teamPoints, team2, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> sortedTeams = new ArrayList<>(teamPoints.entrySet());
        sortedTeams.sort((team1, team2) -> {
            int pointsComparison = Integer.compare(team2.getValue(), team1.getValue());
            return pointsComparison != 0 ? pointsComparison : team1.getKey().compareTo(team2.getKey());
        });

        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedTeams) {
            System.out.println(rank + ". " + entry.getKey() + " " + entry.getValue());
            rank++;
        }
    }

    private static void updatePoints(Map<String, Integer> teamPoints, String team, int points) {
        teamPoints.put(team, teamPoints.getOrDefault(team, 0) + points);
    }

    private static String getTeamName(String[] teamScores) {
        StringBuilder teamName = new StringBuilder();
        for (int i = 0; i < teamScores.length - 1; i++) {
            if (i > 0) {
                teamName.append(" ");
            }
            teamName.append(teamScores[i]);
        }
        return teamName.toString();
    }
}
