package edu.hillel.yuriybocharov.godzilla2;


import static edu.hillel.yuriybocharov.godzilla2.Main.j;
import static edu.hillel.yuriybocharov.godzilla2.Main.food;

public class Sniper extends Person {

    private int centerCoordinateSniperX = (int) ((Math.random () * 15) + 1);
    private int centerCoordinateSniperY = (int) ((Math.random () * 15) + 1);

    private int weight = 100;

    public Sniper(int armor, int attack) {
        super (armor, attack);
    }

    public int getWeight() {
        return weight;
    }

    public void say() {
        System.out.println ("Вижу противника.");
    }

    public void BattleSniper (Godzilla godzilla) {
        // food = godzilla.refreshCalories ();
        Artillery artillery = new Artillery ();
        Sniper sniper = new Sniper (200, (int) (Math.random () * 60) + 30);
        int q = sniper.getArmor ();


        double d = Math.pow (centerCoordinateSniperX - godzilla.getCenterCoordinateGodzillaX (), 2) + Math.pow (centerCoordinateSniperY - godzilla.getCenterCoordinateGodzillaY (), 2);

        if (d > Math.pow (godzilla.getRadiusOfInjury (), 2)) {
            j -= sniper.refreshAttack (sniper.getAttack ());
            System.out.println ();
            System.out.print ("Снайпер нанес урон. ");
            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");

        } else {
            j  -= sniper.refreshAttack (sniper.getAttack ());
            System.out.println ();
            System.out.print ("Снайпер нанес урон. ");
            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");
            godzilla.say ("Солдафон!");
            System.out.println ();
            System.out.println ("Годзилла заметил меня. Веду бой.");
            for (godzilla.refreshArmor (j); godzilla.refreshArmor (j) > 0; j--) {
                for (sniper.refreshArmor (sniper.getArmor ()); sniper.refreshArmor (sniper.getArmor ()) > 0; q--) {
                    j = godzilla.getArmor () - sniper.refreshAttack (sniper.getAttack ());
                    q = sniper.getArmor () - godzilla.refreshAttack (godzilla.getAttack ());
                    if (sniper.refreshArmor (q) < 0) {
                        q = 0;
                    }
                    if (godzilla.refreshArmor (j) < 0) {
                        j = 0;
                    }


                    System.out.println ();
                    System.out.print ("У снайпера осталось: " + sniper.refreshArmor (q) + " брони;     ");
                    System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");
                    if (sniper.refreshArmor (q) < 2) {
                        System.out.println ();
                        System.out.println ("Вызываю артлерию на себя!");
                        System.out.println ();
                        artillery.hit (godzilla);

                    }

                    if (sniper.refreshArmor (q) <= 0) {
                        System.out.println ();
                        System.out.println ("Годзилла сожрал снайпера!");
                        food += sniper.getWeight ();
                        System.out.println ();
                        System.out.println ("Я сожрал уже: " + godzilla.refreshCalories (food) + " килограмм человечины");
                    }


                    if (godzilla.refreshArmor (j) <= 0) {
                        break;
                    }
                }
                if (sniper.refreshArmor (q) <= 0) {
                    break;

                }
            }
        }
    }

    }


