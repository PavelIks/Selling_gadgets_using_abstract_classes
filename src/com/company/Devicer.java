package com.company;

public abstract class Devicer
{
    protected double diagonal;
    protected double price;
    protected String processor;
    protected int MemoryGb;
    protected int OZUGb;
    protected int ChargePercent;
    {
        processor="Random Core i12";
        diagonal=7.6;
        price=5600;
        MemoryGb=512;
        OZUGb=8;
        ChargePercent=100;
    }

    public void setDiagonal(double diagonal)
    {
        this.diagonal = diagonal;
    }

    public void setMemoryGb(int memoryGb)
    {
        MemoryGb = memoryGb;
    }

    public void setOZUGb(int OZUGb)
    {
        this.OZUGb = OZUGb;
    }

    public void setProcessor(String processor)
    {
        this.processor = processor;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public double getDiagonal()
    {
        return diagonal;
    }

    public int getMemoryGb()
    {
        return MemoryGb;
    }

    public int getOZUGb()
    {
        return OZUGb;
    }

    public String getProcessor()
    {
        return processor;
    }
}