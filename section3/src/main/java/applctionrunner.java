import bean.vechical;
import config.projectconfigration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;

public class applctionrunner {
    static void main() {
       var context = new AnnotationConfigApplicationContext(projectconfigration.class);
       vechical veh = context.getBean( vechical.class);
        System.out.println("form spring contain  "+veh.getName());

        String sData = context.getBean(String.class);
        System.out.println("Spring Bean fecthed From IOC Container" + sData);

        Integer[] nums = context.getBean(Integer[].class);
        System.out.println("Spring Bean fecthed From IOC Container"+ Arrays.deepToString(nums));

        HashSet<String>hashSet = context.getBean(HashSet.class);
        System.out.println("Spring bean fetch from ioc container" +hashSet);

    }
}
