package edu.hillel.yuriybocharov.godzilla2;


public class Main {

    public static void menu() {
        System.out.println ();
        System.out.println ("Меню:");
        System.out.println ("1. Играть");
        System.out.println ("2. Выход");
        System.out.println ();
        System.out.println ("Для выбора введите цифру:");
        System.out.println ();
    }

    public static int j;
    public static int food;

    public static void main(String[] args) {
        CommonMenu.start ();
    }
}