package org.s2p.Bean;
import org.s2p.Bean.vehical;

public class person {
    private String Name;
    private vehical vehicals;
    public  person()
    {
        System.out.println("daefult bean class person name");
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getvehical()
    {
        return vehicals;
    }
    public void setvehical(vehical vehical)
    {
        this.vehicals = vehical;
    }
}
