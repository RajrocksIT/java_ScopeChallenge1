package com.rajeshchinni;

import java.util.Scanner;

public class X {
    private int x;

    // constructor
    public X(Scanner x) {   // changes made here
        System.out.println("Please enter a number here");     // newly added
        this.x = x.nextInt();  // changes made here
    }

    // method
    public void x(){
        for (int x = 1; x<13; x++){
            System.out.println(x + " time " + this.x + " equals " + x*this.x);
        }
    }
}
