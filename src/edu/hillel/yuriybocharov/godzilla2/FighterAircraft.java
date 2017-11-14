package edu.hillel.yuriybocharov.godzilla2;


import static edu.hillel.yuriybocharov.godzilla2.Main.j;

public class FighterAircraft extends Person {
    int fighterAircraft = 500;


    private static int centerCoordinateFighterAircraftX = (int) ((Math.random () * 15) + 1);
    private static int centerCoordinateFighterAircraftY = (int) ((Math.random () * 15) + 1);


    public void bombDrop(Godzilla godzilla) {
        System.out.println ();
        System.out.println ("Говорит 'Ястреб Один'");
        System.out.println ("Вижу годзилу, запускаю ракеты");
        double d = Math.pow (centerCoordinateFighterAircraftX - godzilla.getCenterCoordinateGodzillaX (), 2) + Math.pow (centerCoordinateFighterAircraftY - godzilla.getCenterCoordinateGodzillaY (), 2);

        if (d > Math.pow (godzilla.getRadiusOfInjury (), 2)) {
            j = godzilla.getArmor () - fighterAircraft;

            System.out.println ();
            System.out.println ("Ракеты попали в цель!");
            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");
            System.out.println ();
        } else {
            System.out.println ();
            System.out.println ("Черт!!!");
            System.out.println ("Вокруг него какое-то  силовое поле");
            System.out.println ("Система неведения ракет не работает");
            System.out.println ("Я промахнулся!");
            System.out.println ();

        }
    }

}
