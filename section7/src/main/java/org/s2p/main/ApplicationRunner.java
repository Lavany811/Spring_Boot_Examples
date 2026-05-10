package org.s2p.main;
import org.s2p.Bean.vehical;
import org.s2p.Bean.person;
import org.s2p.Config.projectconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(projectconfig.class);
        person persons = context.getBean(person.class);
        vehical vehicals = context.getBean(vehical.class);
        System.out.println("main funtion ka hai person "+persons.getName());
        System.out.println("main funtion of vechical "+persons.getvehical());
    }
}
