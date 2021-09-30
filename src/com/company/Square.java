package com.company;

public class Square extends shape{



            double width, height;

            public void set(float x, float y, float w, float h){

                this.width=w;
                this.height=h;
                this.x=x;
                this.y=y;
            }

public double area(){
                return this.width * this.height;

}
public double circumference(){
                return 2 * (this.width + this.height);
}


        public boolean pointoverlap(float x, float y){

            return x > this.x - this.width/2 && x < this.x + this.width/2 && y > this.y - this.height/2 && y < this.y + this.height/2;
        }

        }