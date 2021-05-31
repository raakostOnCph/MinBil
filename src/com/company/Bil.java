package com.company;

public class Bil
{
    IFMoter motor;

    IFHorn båtHorn;

    CoDriver coDriver;

    public Bil(IFMoter motor, IFHorn båtHorn, CoDriver coDriver)
    {
        this.motor = motor;
        this.båtHorn = båtHorn;
        this.coDriver = coDriver;
    }
}
