package com.sim.app.java8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf     = new SimpleDateFormat("yyyyMMdd");

        System.out.println(sdf.toPattern());
        String time = sdf.format(new Date());
        System.out.println(time);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMdd");


        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter2);
        String formatDateTime2 = now.format(formatter3);

        System.out.println(formatDateTime);
        System.out.println(formatDateTime2);

    }

}
