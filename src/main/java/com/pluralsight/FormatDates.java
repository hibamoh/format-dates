package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter america = DateTimeFormatter.ofPattern("E,MMM dd yyyy");

        /*
        MM-dd-yyyy 10/29/2026
        yyyy-MM-dd 2026-10-206
        dd/MM/yyyy 29/10/2026
        E, MMM dd yyyy

         */

        System.out.println(today.format(america));

    }
}
