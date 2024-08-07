package CodingQ;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SeparateDate {
    public static void main(String[] args) {
        // Example date string
        String dateString = "2023-07-25";

        // Call the method to separate the date components
        separateDate(dateString);
    }

    public static void separateDate(String dateString) {
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the date string to a LocalDate object
        LocalDate date = LocalDate.parse(dateString, formatter);

        // Separate the date components
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        // Print the separated components
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
