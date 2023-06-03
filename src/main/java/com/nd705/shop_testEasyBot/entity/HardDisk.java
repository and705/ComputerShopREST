package com.nd705.shop_testEasyBot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class HardDisk extends Product {

    private int capacity;

    public HardDisk() {}

    public HardDisk(int capacity) {
        this.capacity = capacity;
    }

    public HardDisk(String serialNumber, String manufacturer, double price, int quantity, int capacity) {
        super(serialNumber, manufacturer, price, quantity);
        this.capacity = capacity;
    }



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
