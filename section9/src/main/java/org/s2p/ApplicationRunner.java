package org.s2p;

import org.s2p.bean.Person;
import org.s2p.bean.Vehical;
import org.s2p.config.Projectconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(Projectconfig.class);
        Vehical vehical = context.getBean(Vehical.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name from Spring Context is"+person.getPerson());
        System.out.println("vehical name from Spring Context "+vehical.getBrandname());
        System.out.println("vehical that person own it"+person.getVehical());

    }
}
