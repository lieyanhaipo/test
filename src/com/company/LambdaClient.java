package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class LambdaClient {

    public static void main(String[] args) {
	    // lambda
        Arrays.asList("a", "b", "c").forEach(System.out::println);

        List<String> strings = Arrays.asList("a", "b", "c");
        for (int i = 0; i < strings.size(); i++) {

        }

        payAmount();


    }


    //函数式接口
    private static void payAmount(){
        BigDecimal money = BigDecimal.TEN;

        // 匿名类，接口支持
//        ITest test = new ITest(){
//            @Override
//            public void pay(BigDecimal amount) {
//                System.out.println("payed amount");
//            }
//        };
        // 抽象类不支持
//       AbstractTest abstractTest = new AbstractTest() {
//            @Override
//            public void run() {
//                System.out.println("run to home");
//            }
//        };


        ITest test1 = amount -> {
//            money = amount.add(money);
            System.out.println("payed" + money);
        };
        test1.pay(money);


        // 默认方法
        test1.cal();
        // 静态方法
        ITest.order();
    }

    //
}
