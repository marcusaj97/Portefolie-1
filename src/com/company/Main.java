package com.company;

public class Main {



    public static void main(String[] args) {
	Circle c = new Circle();
    c.set(2,3,10);
    System.out.println(c.returnCentrum());
    System.out.println(c.area());
    System.out.println(c.circumference());
    System.out.println(c.pointoverlap(12,3));

    Square s = new Square();
    s.set(10,5, 6, 9);
    System.out.println(s.returnCentrum());
    System.out.println(s.area());
    System.out.println(s.circumference());
    }
}
