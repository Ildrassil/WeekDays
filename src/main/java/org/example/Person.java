package org.example;

public record Person(
        String name,
        int id,
        DaysOfWeek favoriteDay,
        Gender gender

) {

}
