package com.company;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * @Auther: libing
 * @Date: 2021/1/24 10:56
 * @Description:
 */
public class MethodReferenceClient {
    public static void main(String[] args) {
        // 两个参数构造器
        BiFunction<String, Integer, Traffic> traffic1 = (trafficName, ticketPrice) -> new Traffic(trafficName, ticketPrice);
        System.out.println(traffic1.apply("bicycle1", 1).getTrafficName());
        BiFunction<String, Integer, Traffic> traffic2 = Traffic::new;
        System.out.println(traffic2.apply("bicycle2", 1).getTrafficName());

        // 类静态方法
        ITraffic bus = (trafficName, ticketPrice) -> {
            System.out.println(trafficName);
            System.out.println(ticketPrice);
        };
        bus.byTraffic("bus", 2);

        ITraffic taxi = Traffic::print;
        taxi.byTraffic("taxi", 20);


        // 对象实例方法
        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };
        consumer2.accept("consumer2");

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("consumer");

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("consumer1");

        // 类实例方法
        BiPredicate<String,String> bp = (x, y) -> x.equals(y);
        System.out.println(bp.test("xy", "xy"));
        BiPredicate<String,String> bp2 = String::equals;
        System.out.println(bp2.test("xy", "xyz"));
    }
}
