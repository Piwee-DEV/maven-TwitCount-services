package net.piwee.twitcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by alexandrenguyen on 12/03/16.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Inspecting loaded beans...");

        String[] beanNames = ctx.getBeanDefinitionNames();

        Arrays.asList(beanNames).parallelStream().forEachOrdered(beanName -> System.out.println(beanName));
    }
}
