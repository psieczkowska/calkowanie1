package edu;

public class Main {

    public static void main(String[] args) {
        MetodaTrapezow f = new MetodaTrapezow();
        System.out.println("Metoda trapezów:");
        System.out.println(f.metodaTrapezow(10,0,1));
        System.out.println(f.metodaTrapezow(100,0,1));
        System.out.println(f.metodaTrapezow(1000,0,1));
        System.out.println(f.metodaTrapezow(10000,0,1));
        MetodaSimpsona ff = new MetodaSimpsona();
        System.out.println("Metoda Simpsona:");
        System.out.println(ff.metodaSimpsona(11,0,1));
        System.out.println(ff.metodaSimpsona(100,0,1));
        System.out.println(ff.metodaSimpsona(1000,0,1));
        System.out.println(ff.metodaSimpsona(10000,0,1));
    }
}
