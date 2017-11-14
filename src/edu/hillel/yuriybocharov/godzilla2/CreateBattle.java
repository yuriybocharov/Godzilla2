package edu.hillel.yuriybocharov.godzilla2;



import static edu.hillel.yuriybocharov.godzilla2.Main.food;
import static edu.hillel.yuriybocharov.godzilla2.Main.j;


public class CreateBattle extends Person {


    Person listSpecialForces[] = new Person[3]; // Создали список войнов, он пока пустой


    Gunner gunner = new Gunner (250, (int) (Math.random () * 100) + 50);
    GrenadeLauncher grenadeLauncher = new GrenadeLauncher (150, (int) (Math.random () * 120) + 70);
    StormTrooper stormTrooper = new StormTrooper (200, (int) (Math.random () * 50) + 30);

    public void Forces() {

        listSpecialForces[0] = (gunner = new Gunner (250, (int) (Math.random () * 100) + 50));
        listSpecialForces[1] = (grenadeLauncher = new GrenadeLauncher (150, (int) (Math.random () * 120) + 70));
        listSpecialForces[2] = (stormTrooper = new StormTrooper (200, (int) (Math.random () * 50) + 30));

    }


    public void Battle() {
        Godzilla godzilla = new Godzilla (10, 10000, (int) (Math.random () * 80) + 40);
        Forces ();
        int q = gunner.getArmor ();
        int w = grenadeLauncher.getArmor ();
        int r = stormTrooper.getArmor ();




                while (gunner.refreshArmor (q) > 0 & godzilla.refreshArmor (j) > 0 || grenadeLauncher.refreshArmor (w) > 0 & godzilla.refreshArmor (j) > 0 || stormTrooper.refreshArmor (r) > 0 & godzilla.refreshArmor (j) > 0)


                    outer:
                            for (int b = 0; b < listSpecialForces.length; b++) {


                                if (listSpecialForces[b].equals (gunner) && gunner.refreshArmor (q) == 0) {

                                    continue ;}
                                    else if (listSpecialForces[b].equals (gunner)){

                                    for (godzilla.refreshArmor (j); godzilla.refreshArmor (j) > 0; ) {
                                        for (gunner.refreshArmor (gunner.getArmor ()); gunner.refreshArmor (gunner.getArmor ()) > 0; ) {
                                            j = godzilla.getArmor () - gunner.refreshAttack (gunner.getAttack ());
                                            q = gunner.getArmor () - godzilla.refreshAttack (godzilla.getAttack ());
                                            if (gunner.refreshArmor (q) <= 0){
                                                System.out.println ("Пулеметчик убит");
                                                q = 0;
                                            }
                                            if (godzilla.refreshArmor (j) < 0) {
                                                j = 0;
                                                System.out.println ("Годзилла уничтожен!!!");
                                            }

                                            System.out.print ("У пулеметчика осталось: " + gunner.refreshArmor (q) + " брони.");
                                            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");

                                            continue outer;
                                        }

                                    }


                                }


                                if (listSpecialForces[b].equals (grenadeLauncher) && grenadeLauncher.refreshArmor (w) == 0) {

                                    continue ;}
                                    else if (listSpecialForces[b].equals (grenadeLauncher)){

                                    for (godzilla.refreshArmor (j); godzilla.refreshArmor (j) > 0; ) {
                                        for (grenadeLauncher.refreshArmor (grenadeLauncher.getArmor ()); grenadeLauncher.refreshArmor (grenadeLauncher.getArmor ()) > 0; ) {
                                            j = godzilla.getArmor () - grenadeLauncher.refreshAttack (grenadeLauncher.getAttack ());
                                            w = grenadeLauncher.getArmor () - godzilla.refreshAttack (godzilla.getAttack ());
                                            if (grenadeLauncher.refreshArmor (w) <= 0){
                                                System.out.println ("Гранатометчик убит");
                                                w = 0;
                                            }
                                            if (godzilla.refreshArmor (j) < 0) {
                                                j = 0;
                                                System.out.println ("Годзилла уничтожен!!!");
                                            }
                                            System.out.print ("У гранатометчика осталось: " + grenadeLauncher.refreshArmor (w) + " брони.");
                                            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");

                                            continue outer;
                                        }

                                    }

                                }


                                if (listSpecialForces[b].equals (stormTrooper) && stormTrooper.refreshArmor (r) == 0) {

                                    continue;
                                }
                                    else if (listSpecialForces[b].equals (stormTrooper)){
                                    for (godzilla.refreshArmor (j); godzilla.refreshArmor (j) > 0; ) {
                                        for (stormTrooper.refreshArmor (stormTrooper.getArmor ()); stormTrooper.refreshArmor (stormTrooper.getArmor ()) > 0; ) {
                                            j = godzilla.getArmor () - stormTrooper.refreshAttack (stormTrooper.getAttack ());
                                            r = stormTrooper.getArmor () - godzilla.refreshAttack (godzilla.getAttack ());
                                            if (stormTrooper.refreshArmor (r) <= 0){
                                                System.out.println ("Штурмовик убит");
                                                r = 0;
                                            }
                                            if (godzilla.refreshArmor (j) < 0) {
                                                j = 0;
                                                System.out.println ("Годзилла уничтожен!!!");
                                            }
                                            System.out.print ("У штурмовика осталось: " + stormTrooper.refreshArmor (r) + " брони.");
                                            System.out.println ("У Годзиллы осталось: " + godzilla.refreshArmor (j) + " брони.");

                                            continue outer;
                                        }
                                    }

                                }

                            }
                            food += 300;
        System.out.println ();
        System.out.println ("Я сожрал уже: " + godzilla.refreshCalories (food) + " килограмм человечины");
        }

    }

