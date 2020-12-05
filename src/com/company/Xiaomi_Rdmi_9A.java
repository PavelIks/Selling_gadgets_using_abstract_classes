package com.company;

public class Xiaomi_Rdmi_9A extends Devicer implements ITelephone
{
    {
        this.price=9500;
    }

    @Override
    public void Recharge()
    {
        if(this.ChargePercent<100)
        {
            this.ChargePercent++;
        }
    }

    @Override
    public void Discharge()
    {
        if(this.ChargePercent>0)
        {
            this.ChargePercent--;
        }
    }

    @Override
    public void MakePhoto()
    {

    }

    @Override
    public void Phone()
    {

    }

    @Override
    public void SayPrice()
    {
        System.out.println("Стоимость: ₴" + price);
    }
}