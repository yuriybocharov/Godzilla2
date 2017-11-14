package edu.hillel.yuriybocharov.godzilla2;

import static edu.hillel.yuriybocharov.godzilla2.Main.food;
public class Human extends Person {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public Human(int speed, int weight) {
        super (speed);
        this.weight = weight;
    }

    public void say() {
        System.out.println ("Аааааааа это же Годзилла!");
    }

    public void BattleHuman (Godzilla godzilla){
       // food = godzilla.refreshCalories ();
        Human human = new Human ((int) (Math.random () * 10) + 3, (int) (Math.random () * 70) + 50);
        if (human.getSpeed () < godzilla.getSpeed ()) {
            food += human.getWeight ();
            System.out.println ("Уом ном ном");
            System.out.println ("Я сожрал уже: " + godzilla.refreshCalories (food) + " килограмм человечины");

        } else {
            food -= 20;
           //System.out.println (human.getSpeed ());
            if (godzilla.refreshCalories (food) < 0){
                food = 0;
            }
            System.out.println ("Не догонишь!!!");
            System.out.println ();
            System.out.println ("Я похудел на 20 килограмм ");
            System.out.println ("В моем желудке осталось: " + godzilla.refreshCalories (food) + " килограмм");
        }
    }
}
