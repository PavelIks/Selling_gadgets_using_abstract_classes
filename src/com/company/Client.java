package com.company;

public class Client implements IBuy
{
    @Override
    public boolean Buy(IProduct product)
    {
        if(product!=null)
        {
            System.out.println("Товар получен!");
            return true;
        }
        return false;
    }
}