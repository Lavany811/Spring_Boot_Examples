package org.s2p.config;
import org.s2p.bean.Vehical;
import org.s2p.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.s2p.bean")
public class Projectconfig
{
    @Bean
   Vehical vehical1()
   {
       Vehical alto = new Vehical();
       alto.setBrandname("Alto H2R");
       return alto;

   }
   @Bean
   @Primary
   Vehical vehical2()
   {
       Vehical bmw = new Vehical();
       bmw.setBrandname("BMW M5");
       return bmw;
   }
   @Bean
   Vehical vehical3()
   {
       Vehical audi = new Vehical();
       audi.setBrandname("AUDI SUSUSUS");
       return audi;
   }
    }

