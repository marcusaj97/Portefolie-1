package com.company;


	public class Square extends shape{


        public static void main(String[] args){
            double bredde, højde, areal, omkreds;

            bredde = 5;

            højde = 10;



            areal = bredde * højde;
            omkreds = 2 * (bredde + højde);

            System.out.println(areal);
            System.out.println(omkreds);



        }

    }
