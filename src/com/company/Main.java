package com.company;

public class Main {



    public static void main(String[] args) {
	Circle c = new Circle();
    c.set(2,3,10);
    System.out.println("Det næste er cirkel");
    System.out.println(c.returnCentrum());
    System.out.println(c.area());
    System.out.println(c.circumference());
    System.out.println(c.pointoverlap(12,3));

    System.out.println();

    Square s = new Square();
    s.set(10,5, 6, 9);
    System.out.println("Det næste er firkant");
    System.out.println(s.returnCentrum());
    System.out.println(s.area());
    System.out.println(s.circumference());
    System.out.println(s.pointoverlap(10,5));

    System.out.println();
    System.out.println("Her starter trekant");

    Triangles t = new Triangles();
    t.set(10,20,10,5);
    System.out.println(t.returnCentrum());
    System.out.println(t.area());
    System.out.println(t.circumference());
    System.out.println(t.pointoverlap(11,17));


    }

}
