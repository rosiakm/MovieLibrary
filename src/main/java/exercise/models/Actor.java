package exercise.models;

import java.util.List;

public class Actor {
    private String firstName;
    private String lastName;

    public Actor() {
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String convertActorsListToString(List<Actor>actors){
        String s = actors.toString();
        return s.substring(1,s.length()-1);
    }

    @Override
    public String toString() {
        return this.firstName + ' ' + this.lastName;
    }
}
