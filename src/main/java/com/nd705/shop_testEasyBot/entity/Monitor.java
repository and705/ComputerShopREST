package com.nd705.shop_testEasyBot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
public class Monitor extends Product {
    private double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    public Monitor(String serialNumber, String manufacturer, double price, int quantity, double diagonal) {
        super(serialNumber, manufacturer, price, quantity);
        this.diagonal = diagonal;
    }



    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}