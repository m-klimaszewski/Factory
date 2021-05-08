package com.company;

import java.util.Scanner;

public class Main {
    private static Application config(int army_unit) {
        Application app;
        I_Abstract_Unit_Factory factory;


        switch (army_unit) {
            case 1:
                factory = new Barrack_Factory();
                app = new Application(factory);
                break;
            case 2:
                factory = new Hangar_Factory();
                app = new Application(factory);
                break;
            case 3:
                factory = new Port_Factory();
                app = new Application(factory);
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + army_unit);
        }
        return app;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int army_unit;
        System.out.println("Stwórz jednostkę:\n1. Koszary\n2. Hangar\n3. Port\n0. Zakończ");
        while ((army_unit = in.nextInt()) != 0) {
            Application app = config(army_unit);
            app.show();
            System.out.println("Stwórz jednostkę:\n1. Koszary\n2. Hangar\n3. Port\n0. Zakończ");
        }
    }
}
