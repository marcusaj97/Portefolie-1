package com.company;
import java.lang.Math;

public class Triangles extends shape {

    float height, width;

    public void set(float x, float y, float h, float w){

        this.width=w;
        this.height=h;
        this.x=x;
        this.y=y;
    }

    public double area(){
        float x2 = this.x;
        float y2 = this.y + this.height / 2;
        float x3 = this.x + this.width / 2;
        float y3 = this.y - this.height / 2;
        float x1 = this.x - this.width / 2;
        float y1 = this.y - this.height / 2;

        return (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2;

    }

    public double circumference(){

        double c = Math.sqrt(Math.pow(this.width/2,2)+Math.pow(this.height,2));
        return this.width + c * 2;


    }

    public boolean pointoverlap(float x, float y){

        float x2 = this.x;
        float y2 = this.y + this.height / 2;
        float x3 = this.x + this.width / 2;
        float y3 = this.y - this.height / 2;
        float x1 = this.x - this.width / 2;
        float y1 = this.y - this.height / 2;

        float a3 =  (x1*(y2-y) + x2*(y-y1) + x*(y1-y2)) / 2;
        float a2 = (x1*(y-y3) + x*(y3-y1) + x3*(y1-y)) / 2;
        float a1 = (x*(y2-y3) + x2*(y3-y) + x3*(y-y2)) / 2;


        return this.area() == a1+a2+a3 && a1 <= 0 && a2 <= 0 && a3 <= 0;

    }

}
