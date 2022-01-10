package com.ega;

public class Main {

    public static void main(String[] args) {
//String[] stars = {"**********"};
//
//        for (String a : stars){
//            System.out.println(a);
//        }
        //1.uzd 1. variants
        for (int i = 0; i <= 4; i++) {

            System.out.print("***********");
            System.out.println();
        }


        //1.uzd 2. variants.
        for (int i = 0; i <= 4; i++) {
            for (int a = 10; a >= 0; a--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //2.uzd
        for (int i = 0; i <= 4; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //3.uzd
        for (int i = 4; i >= 0; i--) {
            for (int b = 0; b <= i - 1; ++b)
                System.out.print(" ");
            for (int a = 4; a >= i; a--) {
                System.out.print("*");// pieliekot atstarpi, sanāk egle
            }
            System.out.println();

        }
        System.out.println();
        //4.uzd nesanāk galotne.vai apakša.
        for (int i = 4; i >= 0; i--) { // rindu daudzums
            for (int b = 0; b <= i; ++b)  // atstarpes dilstošā secībā
                System.out.print(" ");

            for (int a = 4; a >= i; --a){

               for (int d = 0; d+4>=a; --d) {
                    System.out.print("*");}
                }



            System.out.println();

        }



    }
    }







