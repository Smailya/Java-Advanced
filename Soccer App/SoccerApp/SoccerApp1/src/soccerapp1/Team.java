/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccerapp1;

/**
 *
 * @author ISMAIL
 */
import java.util.*;


//we implement the comparable interface by implementing the Comparable interface, the Team class defines a natural ordering for its instances
class Team implements Comparable<Team> {
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public int compareTo(Team other) {
        if (this.points == other.points) {
            return this.name.compareTo(other.name);
        }
        return Integer.compare(other.points, this.points);
    }
}
