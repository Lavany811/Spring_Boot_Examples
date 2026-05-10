package org.s2p.bean;

public class Vehical {
    private String Brandname;
    public void Vehical()
    {
        System.out.println("vehical class in bean");
    }
    public String getBrandname()
    {
        return Brandname;
    }
    public void setBrandname(String Brandname)
    {
        this.Brandname = Brandname;
    }
}
