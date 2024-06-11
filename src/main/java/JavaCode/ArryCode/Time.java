package JavaCode.ArryCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();


        String formattedDate = today.toString(); //2022-02-17

        //2 - Inbuilt patterns FULL, LONG, MEDIUM, SHORT
       /* DateTimeFormatter pattern = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        String formattedDate = today.format(pattern);*/   //17 February 2022

        //3 - Custom Pattern
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMddyyyy");
        String formattedDate1 = today.format(pattern);  //17-02-2022

        System.out.println(formattedDate1);
    }
}
