package com.test.demo;

public class Demo1 {
    public static  void main(String [] args){
        int x = 2;
        int y = 100;
        double result = Math.log(x) / Math.log(y) * 100 ;
        System.out.println("log("+ x + "," + y+ ") = " + result + "%" );
        double result2 = log(x,y);

        System.out.println("log("+ x + "," + y+ ") = " + result2 + "" );

        System.out.println(Math.log(2));

    }

    public  static double log(double value, double base) {
        return Math.log(value) / Math.log(base);
    }
}
