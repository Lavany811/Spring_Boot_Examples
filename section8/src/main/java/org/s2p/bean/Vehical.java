package org.s2p.bean;

import org.springframework.stereotype.Component;
@Component
public class Vehical {
    private String name = "Toyto";

    public Vehical()
    {
        System.out.println("vehical call by bean ");
    }
    public String getname()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
