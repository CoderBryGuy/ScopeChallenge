package com.company;


import java.util.Scanner;

public class X {

    public Scanner scanner;
    public int x;


    public X() {
        scanner = new Scanner(System.in);

    }

    public int x(){
        int x;
        System.out.print("Input an integer:");
        x = scanner.nextInt();
        return x;
    }

    public void x(int x){
      this.x = x;
        do{
            System.out.println(this.x + " times :" + x  + " = " + this.x *x );
            x--;
        }while(x > -1);


    }
}
