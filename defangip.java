package com.company;

public class defangip
{
    public static void main(String[] args)
    {
        String t,address = "1.1.1.1";
        t=address.replace(".","[.]");
        System.out.println(t);
    }
}