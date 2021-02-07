package com.company;

/**
 * @Auther: libing
 * @Date: 2021/1/24 14:31
 * @Description:
 */
public class Traffic {
    private String trafficName;

    private Integer ticketPrice;

    Traffic(){

    }

    Traffic(String trafficName, Integer ticketPrice){
        this.trafficName = trafficName;
        this.ticketPrice = ticketPrice;
    }

    public String getTrafficName() {
        return trafficName;
    }

    public void setTrafficName(String trafficName) {
        this.trafficName = trafficName;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public static void print(String trafficName, Integer ticketPrice){
        System.out.println(trafficName);
        System.out.println(ticketPrice);
    }
}
