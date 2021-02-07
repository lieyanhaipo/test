package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @Auther: libing
 * @Date: 2021/1/24 17:35
 * @Description:
 */
public class TimeClient {
    public static void main(String[] args) {

        // 获取当前的日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间: " + now);

        LocalDate date = now.toLocalDate();
        System.out.println("日期: " + date);

        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();

        System.out.println("年: " + year + ",月: " + month +", 日: " + day +", 时: " + hour);

        LocalDateTime date2 = now.withDayOfMonth(2).withYear(2021);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2021, Month.FEBRUARY, 12);
        System.out.println("date3: " + date3);

        LocalTime date4 = LocalTime.parse("08:15:30");
        System.out.println("date4: " + date4);
    }
}
