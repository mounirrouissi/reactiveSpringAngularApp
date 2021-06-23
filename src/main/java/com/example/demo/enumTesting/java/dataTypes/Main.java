package com.example.demo.enumTesting.java.dataTypes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Integer[] arra={1,2,3};
    List<Integer> list= Arrays.asList(arra);
    var  list1=new ArrayList( Arrays.asList( arra ) );
    list.set( 0,2 );
        for (Integer integer : arra) {
            System.out.println( integer );
        }
    list1.add( 111 );

    list1
            .forEach( System.out::println );


    }
}
