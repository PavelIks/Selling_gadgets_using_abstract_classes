package com.company;

public class Main
{
    /*public class Tablet implements IProductable
    {
        private double price;
        {
            price=10500;
        }
        public double getPrice()
        {
            return price;
        }
        public void setPrice(double price)
        {
            this.price = price;
        }
        @Override
        public void SayPrice()
        {
            System.out.println("My price "+ price);
        }
    }*/

    public static void main(String[] args)
    {
        // IBuyerable
        Client cli = new Client();
        // ISellreable
        Maneger maneger = new Maneger();
        // IProductable -> IElectronicable -> ITelephonable -> Xiaomi_Rdmi_9A (Devicer)
        ITelephone xiaomi = new Xiaomi_Rdmi_9A();
        maneger.Sell(xiaomi,cli);
        xiaomi.SayPrice();
    }
}