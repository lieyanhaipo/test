package com.company;

import java.math.BigDecimal;

/**
 * @Auther: libing
 * @Date: 2021/1/24 10:06
 * @Description:
 */
public class Test implements ITest {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("payed amount");
    }

}
