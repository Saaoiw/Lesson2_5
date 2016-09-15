package com.brainacad.laboratorys2_5;

/**
 * Created by Таня on 15.09.2016.
 * Write class InitTest with private field “id” of int type and static private field “nextId” of integer;
 Write code that:
 -	Initialize static field “nextId” of some random value (in 1 … 1000 range) once when class loaded to JVM;
 -	Increments  static field “nextId” each time when new instance of InitTest created;
 -	Initialize field “id” of “nextId” field value each time when new instance of InitTest created.
 And method getId() which will return value of id.
 Create class Main, which will create five instances of class InitTest and invokes method “getId()”
 on each instance and print returned value on console.

 */
public class InitTest {
    private static int nextId;

    private int id;

    static {
        nextId = (int) (1000 * Math.random());
    }

    {
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        InitTest initTest1 = new InitTest();
        System.out.println(initTest1.getId());

        InitTest initTest2 = new InitTest();
        System.out.println(initTest2.getId());

        InitTest initTest3 = new InitTest();
        System.out.println(initTest3.getId());

        InitTest initTest4 = new InitTest();
        System.out.println(initTest4.getId());

        InitTest initTest5 = new InitTest();
        System.out.println(initTest5.getId());
    }
}
