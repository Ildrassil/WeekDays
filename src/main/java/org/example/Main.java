package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vincent Tamana",0001,DaysOfWeek.SATURDAY,Gender.OTHER);
        Person person1 = new Person("Jakob Schneider",0002,DaysOfWeek.THURSDAY,Gender.MALE);
        Person person2 = new Person("Karl Friedrich",0003,DaysOfWeek.MONDAY,Gender.MALE);
        Person person3 = new Person("Mutter Theresa",0004,DaysOfWeek.SUNDAY,Gender.FEMALE);
        Person person4 = new Person("Ayman Abdala",0005,DaysOfWeek.WEDNESDAY,Gender.MALE);
        Person person5 = new Person("Fidel Castro",0006,DaysOfWeek.THURSDAY,Gender.MALE);
        Person person6 = new Person("Frida Carlo",0007,DaysOfWeek.THURSDAY,Gender.FEMALE);
        PersonRepo personMap = new PersonRepo();
        personMap.addPerson(person);
        personMap.addPerson(person1);
        personMap.addPerson(person2);
        personMap.addPerson(person3);
        personMap.addPerson(person4);
        personMap.addPerson(person5);
        personMap.addPerson(person6);
        Person personFound;
        Optional<Person> personOptional = personMap.getPerson(0001);
        if(personOptional.isPresent()){
            personFound =  personOptional.get();
            System.out.println(personFound.name() + "\n" +"Favorite DayType: "+ personFound.favoriteDay().getDayType(personFound.favoriteDay()));
        }else {
            System.out.println("Person not found!");
        }
        System.out.println(personMap.numberOfPersonByGender(Gender.MALE));
        System.out.println(personMap.personByFavporiteDay(DaysOfWeek.THURSDAY));
        System.out.println(personMap.nameSearch("Otto Walkes"));
    }
}