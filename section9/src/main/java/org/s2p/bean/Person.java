package org.s2p.bean;
import org.s2p.bean.Vehical;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
    private String name = "STEVE";
    private Vehical vehical;
@Autowired
    public void Person(Vehical vehical)
    {
        System.out.println("person called from bean ");
    }
    public String getPerson()
    {
        return name;
    }
    public void setPerson(String person)
    {
        this.name= person;
    }
    public Vehical getVehical()
    {
        return vehical;
    }
    public void setVehical(Vehical vehical)
    {
        this.vehical = vehical;
    }
}
