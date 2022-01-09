package com.ega;

public class Main {

    public static void main(String[] args) {
//String[] stars = {"**********"};
//
//        for (String a : stars){
//            System.out.println(a);
//        }
        //1.uzd
        for(int i = 0; i<=4; i++){
            System.out.println("**********");
        }
        System.out.println();
        //2.uzd
        for(int i = 0; i<=3; i++){
            for(int a = 0; a<=i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //3.uzd
                for(int i = 3; i>=0; i--){
                    for(int b =0; b<= i-1; ++b)
                        System.out.print(" ");
            for(int a = 3; a>=i; a--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
        //4.uzd
        for(int i = 3; i>=0; i--) {
            for (int b = 0; b <= i - 1; ++b)
                System.out.print(" ");
            for (int a = 3; a >= i; a--) {
                System.out.print("*");
                for(int c = 3;)
            }
            System.out.println();
        }



    }
}
