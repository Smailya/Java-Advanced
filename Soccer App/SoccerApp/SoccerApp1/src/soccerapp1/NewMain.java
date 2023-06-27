/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccerapp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Team> teamMap = new HashMap<>();

        // Process input and update team scores
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(", ");

            String team1Name = parts[0].split(" ")[0];
            String team2Name = parts[1].split(" ")[0];

            int team1Score = Integer.parseInt(parts[0].split(" ")[1]);
            int team2Score = Integer.parseInt(parts[1].split(" ")[1]);

            Team team1 = teamMap.getOrDefault(team1Name, new Team(team1Name));
            Team team2 = teamMap.getOrDefault(team2Name, new Team(team2Name));

            if (team1Score > team2Score) {
                team1.addPoints(3);
            } else if (team1Score < team2Score) {
                team2.addPoints(3);
            } else {
                team1.addPoints(1);
                team2.addPoints(1);
            }

            teamMap.put(team1Name, team1);
            teamMap.put(team2Name, team2);
        }

        // Sort teams based on points and alphabetical order
        List<Team> teams = new ArrayList<>(teamMap.values());
        Collections.sort(teams);

        // Print the ranking table
        int rank = 1;
        for (Team team : teams) {
            System.out.println(rank + ". " + team.getName());
            System.out.println(team.getPoints());
            rank++;
        }
    }
}