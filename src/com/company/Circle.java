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
       // return x > this.x - this.radius && x < this.x + this.radius && y > this.y - this.radius && y < this.y + this.radius;
        return this.radius >= Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y, 2));

    }


}
