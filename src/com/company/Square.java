package com.company;


	public class Square extends shape{



            double bredde, højde;

            public void set(float b, float h, float x, float y){

                this.bredde=b;
                this.højde=h;
                this.x=x;
                this.y=y;
            }

public double area(){
                return this.bredde * this.højde;

}
public double circumference(){
                return 2 * (this.bredde + this.højde);
}

           // areal = bredde * højde;
           // omkreds = 2 * (bredde + højde);




        }
