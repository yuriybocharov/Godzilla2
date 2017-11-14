package edu.hillel.yuriybocharov.godzilla2;


public class Godzilla extends Person {
    private int stomach = 3000;
    private int centerCoordinateGodzillaX = (int) ((Math.random () * 15) + 1);
    private int centerCoordinateGodzillaY = (int) ((Math.random () * 15) + 1);
    private int RadiusOfInjury = (int) ((Math.random () * 10) + 5);



    public int getRadiusOfInjury() {
        return RadiusOfInjury;
    }

    public int getCenterCoordinateGodzillaX() {
        return centerCoordinateGodzillaX;
    }

    public int getCenterCoordinateGodzillaY() {
        return centerCoordinateGodzillaY;
    }

    public int getStomach() {
        return stomach;
    }

    private int calories = 0;

    public int refreshCalories(int calories) {
        this.calories = calories;
        return calories;
    }

    public Godzilla(int speed, int armor, int attack) {
        super (speed, armor, attack);

    }

    public void say(String name) {
        System.out.println ("Вот ты где " + name);
    }


}
