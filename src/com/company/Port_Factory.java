package com.company;

import java.util.Scanner;

public class Port_Factory implements I_Abstract_Unit_Factory {
    @Override
    public I_Item create_item() {
        System.out.println("Stworzono Port\n 1. Stwórz statek 2. Stwórz łódź podwodną");
        Scanner in = new Scanner(System.in);
        int item = in.nextInt();
        if (item == 1) {
            return new Ship();

        } else if (item == 2) {
            return new Submarine();
        } else {
            return new Bad_Choice();
        }
    }
}
