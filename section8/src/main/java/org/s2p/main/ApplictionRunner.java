package org.s2p.main;

import org.s2p.bean.Person;
import org.s2p.bean.Vehical;
import org.s2p.config.Projectconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplictionRunner {
    public static void main(String[] args)
    {
        var context =  new AnnotationConfigApplicationContext(Projectconfig.class);
        Vehical vehical = context.getBean(Vehical.class);
        Person person = context.getBean(Person.class);
        System.out.println("person String name from string context" +person.getName());
        System.out.println("vehical String name from spring context"+vehical.getname());
        System.out.println("vehical that person own it"+person.getVehical());

    }
}
