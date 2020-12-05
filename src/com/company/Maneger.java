package com.company;

public class Maneger implements ISeller
{
    @Override
    public boolean Sell(IProduct product, IBuy buyer)
    {
        System.out.println("Передача товара...");
        if(buyer.Buy(product))
        {
            System.out.println("Товар успешно продан!");
            return true;
        }
        else
        {
            return false;
        }
    }
}