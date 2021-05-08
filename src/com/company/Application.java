package com.company;

public class Application {
    private I_Item item;
    public Application(I_Abstract_Unit_Factory factory){
        item = factory.create_item();
    }

    public void show(){
            item.create_item();
    }
}
