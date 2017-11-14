package edu.hillel.yuriybocharov.godzilla2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ura on 03.11.2017.
 */
public class Grecheskaya {
    Scanner scanner = new Scanner (System.in);
    CreateBattle createBattle1 = new CreateBattle ();
    CreateBattle createBattle2 = new CreateBattle ();
    Sniper sniper1 = new Sniper (200, (int) (Math.random () * 60) + 30);
    Sniper sniper2 = new Sniper (200, (int) (Math.random () * 60) + 30);
    FighterAircraft fighterAircraft1 = new FighterAircraft ();
    FighterAircraft fighterAircraft2 = new FighterAircraft ();
    Human human1 = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
    Human human2 = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
    Human human3 = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
    Human human4 = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
    Human human5 = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
    Godzilla godzilla = new Godzilla (10, 10000, (int) (Math.random () * 80) + 40);

    private List<Person> listGrecheskaya = new ArrayList<> ();
    private List<Person> listPerson = new ArrayList<> ();
    private Person pers;

    List<Person> addPerson(){
        listPerson.add (createBattle1);
        listPerson.add (createBattle2);
        listPerson.add ( human1);
        listPerson.add ( human2);
        listPerson.add ( human3);
        listPerson.add ( human4);
        listPerson.add ( human5);
        listPerson.add (fighterAircraft1);
        listPerson.add (fighterAircraft2);
        listPerson.add (sniper1);
        listPerson.add (sniper2);
        return listPerson;
    }

    List<Person> addlistGrecheskaya(){
addPerson ();
        for (int i = 0; i < 8 ; i++) {
            int n = (int)(Math.random() * listPerson.size());
            pers = listPerson.get(n);
            listPerson.remove(n);
            listGrecheskaya.add(pers);

        }
        return listGrecheskaya;
    }
    public void BattelStreet () {
 addlistGrecheskaya ();
        int m = 0;
        while (!listGrecheskaya.isEmpty ()) {


            System.out.println ("Жопа");
            System.out.println ();

                //listGrecheskaya.remove (m);
            if (listGrecheskaya.get (m).equals (null)) {
                System.out.println ("НА ЭТОЙ УЛИЦЕ Никого нет");
            }

               else if (listGrecheskaya.get (m).equals (createBattle1)) {
                    createBattle1.Battle ();
                    listGrecheskaya.remove (createBattle1);
                    System.out.println ("получилось");
                }
             else  if (listGrecheskaya.get (m).equals (createBattle2)) {
                    createBattle2.Battle ();
                    listGrecheskaya.remove (createBattle2);
                    System.out.println ("получилось");
                }
              else  if (listGrecheskaya.get (m).equals (human1)) {
                    human1.BattleHuman (godzilla);
                    listGrecheskaya.remove (human1);
                    System.out.println ("получилось");
                }
              else  if (listGrecheskaya.get (m).equals (human2)) {
                    human2.BattleHuman (godzilla);
                    listGrecheskaya.remove (human2);
                    System.out.println ("получилось");
                }
              else  if (listGrecheskaya.get (m).equals (human3)) {
                    human3.BattleHuman (godzilla);
                    listGrecheskaya.remove (human3);
                    System.out.println ("получилось");
                }
              else  if (listGrecheskaya.get (m).equals (human4)) {
                    human4.BattleHuman (godzilla);
                    listGrecheskaya.remove (human4);
                    System.out.println ("получилось");
                }
                else  if (listGrecheskaya.get (m).equals (human5)) {
                    human5.BattleHuman (godzilla);
                    listGrecheskaya.remove (human5);
                    System.out.println ("получилось");
                }
                else  if (listGrecheskaya.get (m).equals (sniper1)) {
                    sniper1.BattleSniper (godzilla);
                    int x = sniper1.getArmor ();
                    if (sniper1.refreshArmor (x) < 0) {
                        listGrecheskaya.remove (sniper1);
                    }
                    System.out.println ("получилось");

                }
                else  if (listGrecheskaya.get (m).equals (sniper2)) {
                    sniper2.BattleSniper (godzilla);
                    int x = sniper2.getArmor ();
                    if (sniper1.refreshArmor (x) < 0) {
                        listGrecheskaya.remove (sniper2);
                    }
                    System.out.println ("получилось");

                }
                else  if (listGrecheskaya.get (m).equals (fighterAircraft1)) {
                    fighterAircraft1.bombDrop (godzilla);
                    listGrecheskaya.remove (fighterAircraft1);
                    System.out.println ("получилось");
                }
                else  if (listGrecheskaya.get (m).equals (fighterAircraft2)) {
                    fighterAircraft2.bombDrop (godzilla);
                    listGrecheskaya.remove (fighterAircraft2);
                    System.out.println ("получилось");
                }
                  if (listGrecheskaya.get (m).equals (null)) {
                    System.out.println ("НА ЭТОЙ УЛИЦЕ Никого нет");
                }
                int a = scanner.nextInt ();
                if (a == 1) {
                    m++;
                }
                if (m >= 8){
                    m = 0;
                }

            }

        }

    }

