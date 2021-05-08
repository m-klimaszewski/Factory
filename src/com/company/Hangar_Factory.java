package com.company;

import java.util.Scanner;

public class Hangar_Factory implements I_Abstract_Unit_Factory {
    @Override
    public I_Item create_item() {
        System.out.println("Stworzono Hangar\n 1. Stwórz helikopter 2. Stwórz odrzutowiec");
        Scanner in = new Scanner(System.in);
        int item = in.nextInt();
        if (item == 1) {
            return new Chopper();

        } else if (item == 2) {
            return new Jet();
        } else {
            return new Bad_Choice();
        }
    }
}
