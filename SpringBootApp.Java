import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
   @Value("${spring.application.name}")
   private String name;
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
   @RequestMapping(value = "/")
   public String name() {
      return name;
//new code changes done by Vivek for the user story hdfc-301
2017-11-26 08:13:16.322  INFO 14028 --- [           
   main] com.tutorialspoint.demo.DemoApplication  :
   The following profiles are active: dev
//new code added for Hdfc-300 userstory --Mahender
@Value("${property_key_name:default_value}")

@Value("${spring.application.name:demoservice}")
2017-11-26 08:13:16.322  INFO 14028 --- [           
   main] com.tutorialspoint.demo.DemoApplication  :
   The following profiles are active: prod
   }
}   


