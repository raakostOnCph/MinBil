package com.company;

public class RugBrødsMoter implements IFMoter
{
    @Override
    public String start()
    {
        return "kom så far";
    }

    @Override
    public String kør()
    {
        return "hrtigere endnu far";
    }
}
