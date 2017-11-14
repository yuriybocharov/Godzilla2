package edu.hillel.yuriybocharov.godzilla2;


import java.util.Scanner;

import static edu.hillel.yuriybocharov.godzilla2.Main.food;
import static edu.hillel.yuriybocharov.godzilla2.Main.j;
import static edu.hillel.yuriybocharov.godzilla2.Main.menu;

public class CommonMenu {

    public static void start() {
        Scanner scanner = new Scanner (System.in);

        CreateBattle createBattle = new CreateBattle ();
        Grecheskaya grecheskaya = new Grecheskaya ();


          Godzilla godzilla = new Godzilla (10, 10000, (int) (Math.random () * 80) + 40);



        j = godzilla.getArmor ();


        while (true) {
            if (godzilla.refreshArmor (j) <= 0) {
                System.out.println ();
                System.out.println ("Вы проиграли!");
                break;
            }
            if (godzilla.refreshCalories (food) >= godzilla.getStomach () * 0.9) {
                System.out.println ();
                System.out.println ("Вы выиграли!");
                break;
            }
            if (godzilla.getStomach () * 0.9 <= godzilla.refreshCalories (food) && godzilla.refreshArmor (j) <= 0) {
                System.out.println ("Ничья!!!");
                break;
            }

            menu ();

            String i = scanner.nextLine ();

            if (i.equals ("1")) {


                 int   n = (int) ((Math.random () * 5) + 1);
                    if (n == 1) {
                        Human human = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
                        System.out.println ();
                        godzilla.say ("человечишко!");
                        System.out.println ();
                        human.say ();
                        System.out.println ();

                        human.BattleHuman (godzilla);


                    }
                   else if (n == 2) {
                        godzilla = new Godzilla (10, 10000, (int) (Math.random () * 80) + 40);
                      Sniper sniper = new Sniper (200, (int) (Math.random () * 60) + 30);
                        //Artillery artillery = new Artillery ();

                        System.out.println ();
                        sniper.say ();
                        System.out.println ();

                        sniper.BattleSniper (godzilla);


                    }
                   else if (n == 3) {
                        FighterAircraft fighterAircraft = new FighterAircraft ();
                        if (godzilla.refreshArmor (j) < 0) {
                            j = 0;
                        }

                        fighterAircraft.bombDrop (godzilla);

                    }
                  else   if (n == 4) {
                        System.out.println ("Докладывает спецназ. Атакуем Годзиллу");

                        createBattle.Battle ();

                    }
//                    if (n == 5){
//                        grecheskaya.addlistGrecheskaya();
//                        System.out.println ();
//                        grecheskaya.BattelStreet ();
//                    }




                }
                if (i.equals ("2")) {
                    break;
                }
                else  {
                    System.out.println ("Вы ввели неправельную цифру.");
                }

            }
        }

    }
