/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingwithdateandtime;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WorkingWithDateAndTime {
    static Scanner sc = new Scanner(System.in); 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nLocalTime: "
                + LocalTime.now().toString());
        System.out.println("\nLocalDateTime: "
                + LocalDateTime.now().toString());
        System.out.println("\nZonedDateTime: "
                + ZonedDateTime.now().toString());
        System.out.println("\nOffsetTime: "
                + OffsetTime.now().toString());
        System.out.println("\nOffsetDateTime: "
                + OffsetDateTime.now().toString());
        System.out.println("\nMonthDay: "
                + MonthDay.now().toString());
        System.out.println("\nYearMonth: "
                + YearMonth.now().toString());
        System.out.println("\nInstant: "
                + Instant.now().toString());
    }

    LocalDateTime dt = LocalDateTime.parse("2014-12-15T15:45");
    LocalDateTime now = LocalDateTime.now();

//Calculating with Dates
/*System.out.println("Today: " + LocalDate.now());
System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));
System.out.println("Next week: " + LocalDate.now().plusWeeks(1));
System.out.println("Next month: " + LocalDate.now().plusMonths(1));
System.out.println("Next year: " + LocalDate.now().plusYears(1)); */
// caomparing date
/* if (LocalDate.now() == LocalDate.now())
System.out.println("All is right in the universe.");
else
System.out.println("There must be a disturbance " +
"in the space-time continuum!");

if (LocalDate.now().isEqual(LocalDate.now()))
System.out.println("All is right in the universe.");*/
//birthday 
    
        
/*do {
LocalDate birthDate;
        DateTimeFormatter fullFormat
                = DateTimeFormatter.ofPattern("MMMM d, YYYY");
        DateTimeFormatter monthDayFormat
                = DateTimeFormatter.ofPattern("MMMM d");
        System.out.println("Today is "
                + LocalDate.now().format(fullFormat) + ".");
        System.out.println();
        System.out.print("Please enter your birthdate "
                + "(yyyy-mm-dd): ");
        String input = sc.nextLine();
        try {
            birthDate = LocalDate.parse(input);
            if (birthDate.isAfter(LocalDate.now())) {
                System.out.println("You haven't been born yet!");
                continue;
            }
            System.out.println();
            System.out.println(birthDate.format(fullFormat)
                    + " was a very good day!");
            DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();
            System.out.println("You were born on a "
                    + birthDayOfWeek + ".");
            long years = birthDate.until(LocalDate.now(),
                    ChronoUnit.YEARS);
            System.out.println("You are " + years + " years young.");
            LocalDate nextBDay = birthDate.plusYears(years + 1);
            System.out.println("Your next birthday is "
                    + nextBDay.format(fullFormat) + ".");
            long wait = LocalDate.now().until(nextBDay,
                    ChronoUnit.DAYS);
            System.out.println("That's just " + wait
                    + " days from now!");
            LocalDate halfBirthday = birthDate.plusMonths(6);
            System.out.println("Your half-birthday is "
                    + halfBirthday.format(monthDayFormat) + ".");
        } catch (DateTimeParseException ex) {
            System.out.println("Sorry, that is not a valid date.");
        }
    }

    while(askAgain()

);
}
private static boolean askAgain()
{
System.out.println();
System.out.print("Another? (Y or N) ");

}
String reply = sc.nextLine();
if (reply.equalsIgnoreCase("Y"))
{
return true;
}
return false;
}*/
}
