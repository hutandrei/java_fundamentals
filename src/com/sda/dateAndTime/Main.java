package com.sda.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // LocalTime

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        int ora = localTime.getHour();
        int minute = localTime.getMinute();
        int secunde = localTime.getSecond();

        System.out.println(ora  + ":" + minute + ":" + secunde);

        LocalTime localTime1 = LocalTime.of(12,50);
        System.out.println(localTime1);
        LocalTime localTime2 = localTime1.plusSeconds(55);
        System.out.println(localTime2);
        LocalTime localTime23 = localTime1.withHour(0);
        System.out.println(localTime23);

        // LocalDate

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalDate localDate1 = LocalDate.parse("1900-01-01");
        System.out.println(localDate1);


        // LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String result = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(result);


        // Instant

        Instant instant = Instant.now();
        System.out.println(instant);

        long sec = instant.getEpochSecond();
        long nano = instant.getNano();
        System.out.println("sec: " + sec + " nano: " + nano);


        // Duration

        LocalTime start = LocalTime.of(10, 30, 0);
        LocalTime end = LocalTime.of(12, 45, 30);

        Duration duration = Duration.between(start, end);
        System.out.println("Durata dintre " + start + " și " + end + " este: " + duration);


        // Period
        LocalDate startD = LocalDate.of(2023, 7, 1);
        LocalDate endD = LocalDate.of(2023, 8, 15);

        Period period = Period.between(startD, endD);
        System.out.println("Perioada dintre " + startD + " și " + endD + " este: " + period);




        // REGEX
        String textRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";  // https://regexr.com/3e48o
        String email = "test@test.com";

        boolean isMatched = true;

        isMatched = Pattern
                .compile(textRegex, Pattern.CASE_INSENSITIVE) // incarca regexul in memorie
                .matcher(email) // incarca textul pe care dorim sa-l verificam
                .matches(); // verifica textul si returneaza true / false

        System.out.println(isMatched);

    }
}
