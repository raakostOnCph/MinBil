package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bil bil = new Bil(new RugBrødsMoter(), new BrønbyHorn(), new Kvinde());

        System.out.println(bil.båtHorn.båt());

        System.out.println(bil.motor.start());

        System.out.println(bil.motor.kør());

        bil.motor = new ElMotor();

        System.out.println(bil.motor.kør());

        bil.motor = new Motor();

        System.out.println(bil.motor.kør());

        System.out.println(bil.motor.start());

        bil.motor = new RugBrødsMoter();

        System.out.println(bil.motor.kør());

        System.out.println(bil.båtHorn.båt());

        bil.båtHorn = new BrønbyHorn();

        System.out.println(bil.båtHorn.båt());

        System.out.println(bil.coDriver.brok());
        System.out.println(bil.coDriver.snakker());

        bil.coDriver = new Kvinde();

        System.out.println(bil.coDriver.brok());

    }
}
