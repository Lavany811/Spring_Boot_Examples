import bean.vechical;
import config.projecctconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    static void main() {
        vechical vechicals = new vechical();
        vechicals.setname("honda city");
        System.out.println("vechical name from non string methoad" + vechicals.getname());

        var context = new AnnotationConfigApplicationContext(projecctconfig.class);

        vechical veh = context.getBean(vechical.class);
        System.out.println(" vechical name from string context" + veh.getname());

    }
}

