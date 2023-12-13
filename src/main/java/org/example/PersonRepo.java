package org.example;

import java.util.*;

public class PersonRepo {

    Map<Integer, Person> personMap = new HashMap<>();

    public void addPerson(Person person) {
        personMap.put(person.id(), person);
    }

    public void removePerson(int id) {
        personMap.remove(id);
    }

    public Optional<Person> getPerson(int id) {
        Optional<Person> isPerson = Optional.ofNullable(personMap.get(id));

        return isPerson;

    }

    public int numberOfPersonByGender(Gender gender) {
        int count = 0;
        for (Person person : personMap.values()) {
            if (person.gender() == gender) {
                count++;
            }

        }
        return count;
    }

    public Optional<Person> nameSearch(String name) {
        Optional<Person> personOptional;
        for (Person person : personMap.values()) {
            if (person.name() == name) {
                personOptional = Optional.ofNullable(person);
                return personOptional;
            }
        }
        return Optional.empty();
    }

    public List<Person> personByFavporiteDay(DaysOfWeek day) {
        List<Person> personList = new ArrayList<>();
        for (Person person : personMap.values()) {
            if (person.favoriteDay() == day) {
                personList.add(person);
            }

        }
        return personList;
    }

}
