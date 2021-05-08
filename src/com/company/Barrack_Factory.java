package com.company;

import java.util.Scanner;

public class Barrack_Factory implements I_Abstract_Unit_Factory {
    @Override
    public I_Item create_item() {

        System.out.println("Stworzono Koszary\n 1. Stwórz żołnieża 2. Stwórz czołg");
        Scanner in = new Scanner(System.in);
        int item = in.nextInt();
        if (item == 1) {
            return new Soldier();

        } else if (item == 2) {
            return new Tank();
        } else {
            return new Bad_Choice();
        }
    }
}
