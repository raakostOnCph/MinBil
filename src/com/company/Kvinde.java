package com.company;

public class Kvinde implements CoDriver
{
    @Override
    public String brok()
    {
        return "kør nu ordenligt du er ikke 18 længere vel !";
    }

    @Override
    public String snakker()
    {
        return "det gør ikke noget at jeg lige lægger nejlelak på imens vel. Og køre forsigt imens !";
    }
}
