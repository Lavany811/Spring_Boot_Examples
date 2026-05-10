package org.s2p.bean;
import org.s2p.bean.Vehical;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = " harypotter";
    private Vehical vehical;

    public Person(Vehical vehical)
    {
        this.vehical = vehical;
        System.out.println("called by bean ");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Vehical getVehical()
    {
        return vehical;
    }
    public void setVehical(Vehical vehical)
    {
        this.vehical = vehical;
        System.out.println("setter method call");
    }
}
