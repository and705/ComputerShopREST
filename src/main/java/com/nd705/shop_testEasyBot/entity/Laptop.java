package com.nd705.shop_testEasyBot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
public class Laptop extends Product {

    private int screenSize;

    public Laptop() {
    }

    public Laptop(String serialNumber, String manufacturer, double price, int quantity, int screenSize) {
        super(serialNumber, manufacturer, price, quantity);
        this.screenSize = screenSize;
    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
