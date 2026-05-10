package org.s2p.Config;
import org.s2p.Bean.person;
import org.s2p.Bean.vehical;
import org.s2p.main.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projectconfig
{
    @Bean
    vehical vehicals() {

        vehical toyato = new vehical();
        toyato.setBrandname("toyto is best car");
        return toyato;

    }
    @Bean
    person persons(vehical vehicals)
    {
        person persons = new person();
        persons.setName("pankaj bhau");
        persons.setvehical(vehicals);
        return persons;
    }
}
