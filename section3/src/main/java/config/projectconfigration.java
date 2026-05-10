package config;
import bean.vechical;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.HashMap;
import java.util.HashSet;

@Configuration
public class projectconfigration {
    @Bean
    vechical vechical1() {
        vechical ferrare = new vechical();
        ferrare.setName("ferrare pata nahi");
        return ferrare;
    }
      @Bean
        vechical vechical2()
        {
            vechical audi = new vechical();
            audi.setName("Audi 1000");
            return audi;
        }
        @Primary
        @Bean
        vechical vechical3()
        {
            vechical porse = new vechical();
            porse.setName("Porse 2cr");
            return porse;
        }
        @Bean
        String S2p()
        {
            String sData = "java hi ";
            return sData;

        }
        @Bean
        Integer[] integers()
        {
            Integer[] nums = {1,2,3,4,5,6,7,8,9};
            return nums;
        }
        @Bean
        HashSet<String>name()
        {
            HashSet<String>nameSet = new HashSet<>();
            nameSet.add("java");
            nameSet.add("python");
            nameSet.add("c++");
            return nameSet;
        }
    }

