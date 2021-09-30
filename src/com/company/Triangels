package com.company;
import java.lang.Math;


public class Triangles extends shape {

    float height, width;

    public void set(float h, float w, float x, float y){

        this.width=w;
        this.height=h;
        this.x=x;
        this.y=y;
    }

    public double area(){
        return (this.height*this.width)/2;

    }

    public double circumference(){

        double c = Math.sqrt(Math.pow(this.width,2)+Math.pow(this.height,2));
        return this.width + this.height + c;

        //return Math.sqrt(Math.pow((this.width/2),2)+Math.pow(this.height,2))*2+this.width;

    }

    public boolean pointoverlap(float x, float y){


        float y1 = this.y;
        float x2 = this.x + this.width;
        float y2 = this.y;
        float x3 = this.x;
        float y3 = this.y + this.height;

        float a1 =  (this.x*(y2-y) + x2*(y-y1)+ x*(y1-y2))/2;
        float a2 = (this.x*(y-y3) + x*(y3-y1)+ x3*(y1-y))/2;
        float a3 = (x*(y2-y3) + x2*(y3-y)+ x3*(y-y2))/2;


        return this.area() == a1+a2+a3 && a1 >=0 && a2 >= 0 && a3 >= 0;

    }

}
