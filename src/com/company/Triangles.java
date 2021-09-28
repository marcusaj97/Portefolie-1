package com.company;

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

        return Math.sqrt(Math.pow((this.width/2),2)+Math.pow(this.height,2))*2+this.width;

    }

    public boolean pointoverlap(){

        return true;

    }

}
