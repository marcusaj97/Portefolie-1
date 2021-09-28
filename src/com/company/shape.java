package com.company;

abstract public class shape {

    float x, y;

    public String returnCentrum() { return  this.x +", "+ this.y;
    }

    public double dist(float x, float y){
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y, 2));
    }

}
