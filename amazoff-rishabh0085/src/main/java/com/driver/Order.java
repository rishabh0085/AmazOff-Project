package com.driver;

public class Order {

    private String id;
    private int deliveryTime;  //calculated as (HH*60 + MM)

    public Order(String id, String deliveryTime) {
        this.id = id;
        Integer hour = Integer.valueOf(deliveryTime.substring(0, 2));
        Integer minutes = Integer.valueOf(deliveryTime.substring(3));
        this.deliveryTime = hour*60 + minutes;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}