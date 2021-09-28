package com.company;
import java.lang.Math;

public class Circle extends shape {

    float radius;

    public void set(float x, float y, float radius){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
// Udregner cirkel areal
    }

    public double circumference(){
        return Math.PI * (this.radius * 2);
// udregner omkreds
    }

    public boolean pointoverlap(float x, float y){
        return this.radius >= this.dist(x,y);

    }


}
