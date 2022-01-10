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

            System.out.print("**********");
            System.out.println();
        }
        System.out.println();

        //1.uzd 2. variants.
        for (int i = 1; i <= 5; i++) {
            for (int a = 10; a >= 1; a--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //2.uzd
        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //3.uzd
        for (int i = 5; i >= 1; i--) {
            for (int b = 1; b <= i - 1; ++b)
                System.out.print(" ");
            for (int a = 5; a >= i; a--) {
                System.out.print("*");// pieliekot atstarpi, sanāk egle
            }
            System.out.println();

        }
        System.out.println();

            // 4. uzd
        for (int i = 0; i <= 5; ++i) { // nosaka rindu skaitu 5
            for (int b = i; b <= 5 - 1; ++b){ // veido trijstūri no atstarpēm.
                System.out.print(" ");
            }
            for (int a = 1; a < i; a++) {// veido egles kreiso daļu, no kuras viena kollona ir ņoņemta (izņemot "=" zīmi)
                System.out.print("*");
            }
            for (int a = 1; a <= i; a++) {// veido labo egles pusi,kur "=" zīme veido par 1 kollonu vairāk nekā kr.
                System.out.print("*");
            }
            System.out.println();

        }



    }
    }







