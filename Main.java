package com.company;

public class Main {
    public void action() {
        Calculate con = new Calculate();                //3- skappa variable con för klassen controll
        con.valja();                                //4- kör method vaälja från klassen controll
    }

    public static void main(String[] args) {
        Main test = new Main();  //1- skappa variable test
        test.action();                             //2-  köra test
    }
}
