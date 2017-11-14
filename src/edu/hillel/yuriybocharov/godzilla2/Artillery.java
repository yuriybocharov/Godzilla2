package edu.hillel.yuriybocharov.godzilla2;

import static edu.hillel.yuriybocharov.godzilla2.Main.j;

public class Artillery {
    int artilleryAttack = 300;

    private static int centerCoordinateArtilleryX = (int) ((Math.random () * 15) + 1);
    private static int centerCoordinateArtilleryY = (int) ((Math.random () * 15) + 1);
    private static int RadiusOfInjury = (int) ((Math.random () * 12) + 1);


    public void hit(Godzilla godzilla) {
        double d = Math.pow (godzilla.getCenterCoordinateGodzillaX () - centerCoordinateArtilleryX, 2) + Math.pow (godzilla.getCenterCoordinateGodzillaY () - centerCoordinateArtilleryY, 2);

        if (d < Math.pow (RadiusOfInjury, 2)) {
            j = godzilla.getArmor () - artilleryAttack;
            System.out.println ();
            System.out.println ("Артиллерия нанесла удар");
            System.out.println ();
            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");
            System.out.println ();
        } else {
            System.out.println ();
            System.out.println ("Артиллерия промахнулась");
            System.out.println ();

        }
    }

}

