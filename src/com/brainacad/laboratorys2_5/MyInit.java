package com.brainacad.laboratorys2_5;

/**
 * Created by Таня on 15.09.2016.
 * 2_5_2
 * Create class “MyInit” with field “arr”of array of integers and non-static initialization block which
 * will initialize that array with random values. (Size of array is 10)
 To generate random numbers you can use next code:
 arr[i]= (int) (100 * Math.random()).
 (Or using Random class instance and nextInt() method invocation).
 Add to class MyInit and method “printArray()” which will print values of this array.
 Create class Main, which will create two instances of class MyInit and invoke method “printArray()”
 to print values of their arrays on console.

 Example of output:
 23,43,11,34,78,59,34,61,24,2
 5,48,50,3,1,4,67,62,78,98
     2_5_3
  Change MyInit class:
  -	change MyInit field “arr” to static field.
  Compile end run. What will you see and why?
     2_5_4
  Change MyInit class:
  -	Change initialization block to static initialization block.
  Compile end run. What will you see and why?

 */
public class MyInit {
    private static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (100 * Math.random());
        }
    }

    void printArray(){
        for (int element : arr) System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MyInit myInit = new MyInit();
        MyInit myInit1 = new MyInit();
        myInit.printArray();
        myInit1.printArray();

    }
}
