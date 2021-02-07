package com.company;

import java.math.BigDecimal;

/**
 * @Auther: libing
 * @Date: 2021/1/24 09:59
 * @Description:
 */
@FunctionalInterface
public interface ITest {
    void pay(BigDecimal amount);

//    void pay2(BigDecimal amount);

//    void receivePay(BigDecimal amount);

    // 默认方法
    default void cal(){
        System.out.println("默认方法 cal amount");
    }


    // 静态方法
    static void order(){
        System.out.println("静态方法");
    }

}
