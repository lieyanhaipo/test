package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: libing
 * @Date: 2021/1/24 16:40
 * @Description:
 */
public class StreamClient {
    public static void main(String[] args) {
        List<String> strLists = Arrays.asList("abc", "b", "c", "", "b");
        strLists.forEach(s -> {

        });

        //forEach迭代
        strLists.stream().forEach(System.out::println);
        //map映射每个元素到对应的结果
        List<String> collect = strLists.stream().map(item -> item + "d").distinct().collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        //filter过滤
        long count = strLists.stream()
                .filter(item -> item.isEmpty())
                .count();
        System.out.println(count);
        //allMatch
        boolean allMatch = Stream.of(1, 2, 3, 4)
                .allMatch(integer -> integer > 0);
        System.out.println("allMatch: " + allMatch);

        //reduce
        //使用Reduce 加和
        Optional<Integer> total = Stream.of(1, 2, 3, 4)
                .reduce((x, y) -> x + y);
        System.out.println(total.get());

        // 并行操作
        long count1 = strLists.parallelStream().filter(item -> item.isEmpty()).count();
        System.out.println(count1);

        testTime();
    }

    private static void testTime() {
        // 获取当前的日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间: " + now);

        LocalDate date = now.toLocalDate();
        System.out.println("日期: " + date);

        Month month = now.getMonth();
        int day = now.getDayOfMonth();
        int hour = now.getHour();

        System.out.println("月: " + month +", 日: " + day +", 时: " + hour);

        LocalDateTime date2 = now.withDayOfMonth(2).withYear(2021);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2021, Month.FEBRUARY, 12);
        System.out.println("date3: " + date3);

        LocalTime date4 = LocalTime.parse("20:15:30");
        System.out.println("date4: " + date4);
    }
}
