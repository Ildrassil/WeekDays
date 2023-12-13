package org.example;

import java.time.LocalDate;

public enum DaysOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String getDayType(DaysOfWeek day){

        switch (day) {
            case MONDAY:
                return MONDAY.name();

            case TUESDAY:
                return TUESDAY.name();


            case WEDNESDAY:
                return WEDNESDAY.name();


            case THURSDAY:
                return THURSDAY.name();

            case FRIDAY:
                return FRIDAY.name();

            case SATURDAY:
                return "Weekend";

            case SUNDAY:
                return "Weekend";

        }


        return null;
    }

}
