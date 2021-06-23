package com.example.demo.enumTesting;

public class Main {
    public static void main(String[] args) {
        for (Day value : Day.values()) {
            System.out.println( value.getDay() );
//            if("MONDAY" == Day.MONDAY.name())
//            {
//                System.out.println("MONDAY  ");
//            }

        }
        Example example = Example.INSTANCE;
        Example example1 = Example.INSTANCE;
        Example example2 = Example.INSTANCE;
        Example example4 = Example.INSTANCE4;
        for (Example e : Example.values()) {
            System.out.println( e );
//            e.sayHello();
        }

    }
Rouissi r=new Rouissi( "a","Monir" );

}
