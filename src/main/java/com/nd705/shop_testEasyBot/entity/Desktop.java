package com.nd705.shop_testEasyBot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Desktop extends Product {

    private String formFactor;

    public Desktop() {}

    public Desktop(String formFactor) {
        this.formFactor = formFactor;
    }

    public Desktop(String serialNumber, String manufacturer, double price, int quantity, String formFactor) {
        super(serialNumber, manufacturer, price, quantity);

        this.formFactor = formFactor;
    }



    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}