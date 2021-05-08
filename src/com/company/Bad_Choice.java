package com.company;

public class Bad_Choice implements I_Item {
    @Override
    public void create_item() {
        System.out.println("Zły wybór");
    }
}
